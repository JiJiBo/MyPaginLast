package com.rulerbug.mypaginlast;

import androidx.annotation.NonNull;
import androidx.paging.PositionalDataSource;

import com.google.gson.Gson;
import com.rulerbug.bugutils.Domain.BugOkHttpDataList;
import com.rulerbug.bugutils.Utils.BugOkHttpUtils;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class JockDataSource extends PositionalDataSource<JockBean.ResultBean> {

    public static final int count = 5;


    @Override
    public void loadInitial(@NonNull LoadInitialParams params, @NonNull LoadInitialCallback<JockBean.ResultBean> callback) {
        int page = 1;
        BugOkHttpUtils.postHttp(Whole.URL, BugOkHttpUtils.getFormBody(new BugOkHttpDataList()
                .add("page", page + "")
                .add("type", "video")
                .add("count", count + "")
        ), new Callback() {

            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                JockBean jockBean = new Gson().fromJson(response.body().string(), JockBean.class);
                callback.onResult(jockBean.getResult(), 0, jockBean.getResult().size());
            }
        });
    }

    @Override
    public void loadRange(@NonNull LoadRangeParams params, @NonNull LoadRangeCallback<JockBean.ResultBean> callback) {

        BugOkHttpUtils.postHttp(Whole.URL, BugOkHttpUtils.getFormBody(new BugOkHttpDataList()
                .add("page", params.startPosition + "")
                .add("type", "video")
                .add("count", count + "")
        ), new Callback() {

            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                JockBean jockBean = new Gson().fromJson(response.body().string(), JockBean.class);
                callback.onResult(jockBean.getResult());
            }
        });
    }
}
