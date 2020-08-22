package com.rulerbug.mypaginlast;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.paging.PagedList;

import com.google.gson.Gson;
import com.rulerbug.bugutils.Domain.BugOkHttpDataList;
import com.rulerbug.bugutils.Utils.BugLogUtils;
import com.rulerbug.bugutils.Utils.BugOkHttpUtils;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class JockBondaryCallBack extends PagedList.BoundaryCallback<JockBean.ResultBean> {

    public static final int count = 5;
    private Context mc;

    public JockBondaryCallBack(Context mc) {
        this.mc = mc;
    }


    @Override
    public void onZeroItemsLoaded() {
        super.onZeroItemsLoaded();
        getTopData();
    }

    private void getTopData() {
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
                dealData(jockBean.getResult().get(0));
            }
        });
    }

    @Override
    public void onItemAtFrontLoaded(@NonNull JockBean.ResultBean itemAtFront) {
        super.onItemAtFrontLoaded(itemAtFront);
//        getTopAfterData(itemAtFront);
    }

    @Override
    public void onItemAtEndLoaded(@NonNull JockBean.ResultBean itemAtEnd) {
        super.onItemAtEndLoaded(itemAtEnd);
        getTopAfterData(itemAtEnd);

    }

    private void getTopAfterData(JockBean.ResultBean itemAtEnd) {

                dealData(itemAtEnd);

    }

    private void dealData(JockBean.ResultBean jockBean) {
        BugLogUtils.e("处理数据");
        BugLogUtils.e(jockBean);
    }
}
