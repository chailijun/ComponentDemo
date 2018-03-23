package com.goodfather.common.utils;

import android.util.Log;


public class L {
    public static boolean DEBUG = false;
//    public static boolean DDBG = false;
//    public static boolean IDBG = false;
//    public static boolean EDBG = false;
//    public static boolean WDBG = false;
//    public static boolean LDBG = false;
//    public static  boolean IS_WTF = false;//是否写入sd卡文件


    public static void d(String tag, Object o) {
        if (DEBUG) {
            Log.d(tag, String.valueOf(o));
        }
    }

    public static void d(Object o) {
        if (DEBUG) {
            Log.d("goodbaba", String.valueOf(o));
        }
    }

    public static void e(String tag, Object o) {
        if (DEBUG) {
            Log.e(tag, String.valueOf(o));
        }
    }

    public static void i(String tag, Object o) {
        if (DEBUG) {
            Log.i(tag, String.valueOf(o));
        }
    }

    public static void v(String tag, Object o) {
        if (DEBUG) {
            Log.v(tag, String.valueOf(o));
        }
    }

    public static void w(String tag, Object o) {

        if (DEBUG) {
            Log.w(tag, String.valueOf(o));
        }
    }


   /* public static void wtf(String tag,Object o,String path) {
        if (DEBUG) {
            LogWritter.writeToFile(path, tag, String.valueOf(o));
        }
    }

    public static void wtf(String tag, Object o) {
        if (IS_WTF) {
            LogWritter.writeToFile(tag, String.valueOf(o));
        }
    }
    public static void wtfAnyWay(String tag, Object o) {
        LogWritter.writeToFile(tag, String.valueOf(o));
    }
    public static void wtfAnyWay(String tag, Object o, String path) {
        LogWritter.writeToFile(path, tag, String.valueOf(o));
    }

    public static void toast(String msg) {
        if (DEBUG) {
            Toast.makeText(C.get(), msg, Toast.LENGTH_SHORT).show();
        }
    }*/
}
