package com.rulerbug.mypaginlast;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PagedList;

public class JockViewModel extends AndroidViewModel {
    public LiveData<PagedList<JockBean.ResultBean>> list;

    public JockViewModel(Application application) {
        super(application);
        PagedList.Config config = (new PagedList.Config.Builder())
                .setEnablePlaceholders(false)
                .setPageSize(Jock2DataSource.count)
                .setPrefetchDistance(3)
                .setInitialLoadSizeHint(Jock2DataSource.count * 4)
                .build();
        list = (new LivePagedListBuilder(new JockDataSourseFactory(), config)).setBoundaryCallback(new JockBondaryCallBack(application)).build();

    }
}
