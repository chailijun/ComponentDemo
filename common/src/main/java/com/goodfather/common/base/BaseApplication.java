package com.goodfather.common.base;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.goodfather.common.utils.AppUtils;
import com.goodfather.common.utils.C;
import com.goodfather.common.utils.L;

/**
 * Created by PVer on 2018/3/19.
 */

public class BaseApplication extends Application{


    @Override
    public void onCreate() {
        super.onCreate();
        C.setContext(getApplicationContext());

        initRouter(this);
    }

    private void initRouter(BaseApplication baseApplication) {
        if (AppUtils.isApkInDebug(this)) {
            ARouter.openLog(); // 开启日志
            ARouter.openDebug(); // 使用InstantRun的时候，需要打开该开关，上线之后关闭，否则有安全风险
            ARouter.printStackTrace(); // 打印日志的时候打印线程堆栈
        }
        ARouter.init(this);
    }
}
