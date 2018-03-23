package com.goodfather.common.base;

import android.app.Application;

import com.goodfather.common.utils.C;

/**
 * Created by PVer on 2018/3/19.
 */

public class BaseApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        C.setContext(getApplicationContext());
    }
}
