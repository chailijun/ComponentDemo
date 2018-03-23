package com.goodfather.common.utils;

import android.support.v4.app.Fragment;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by PVer on 2018/3/23.
 */

public class FragmentUtils {

    public static Fragment getHomeFragment() {
        Fragment fragment = (Fragment) ARouter.getInstance()
                .build(RouteUtils.Home_Fragment_Main)
                .navigation();
        return fragment;
    }

}
