package com.goodfather.app;

import com.alibaba.android.arouter.launcher.ARouter;
import com.goodfather.common.base.BaseApplication;

/**
 * Created by PVer on 2018/3/21.
 */

public class GoodfatherApp extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            ARouter.openLog(); // 开启日志
            ARouter.openDebug(); // 使用InstantRun的时候，需要打开该开关，上线之后关闭，否则有安全风险
            ARouter.printStackTrace(); // 打印日志的时候打印线程堆栈
        }
        ARouter.init(this);
    }
}
