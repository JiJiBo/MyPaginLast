package com.rulerbug.mypaginlast;

import androidx.lifecycle.MutableLiveData;
import androidx.paging.DataSource;

public class JockDataSourseFactory extends DataSource.Factory<Integer, JockBean.ResultBean> {
    private MutableLiveData<Jock2DataSource> list = new MutableLiveData<>();

    @Override
    public DataSource create() {
        Jock2DataSource dataSource = new Jock2DataSource();
        list.postValue(dataSource);
        return dataSource;
    }
}
