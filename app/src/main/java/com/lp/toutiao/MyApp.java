package com.lp.toutiao;

import android.support.multidex.MultiDexApplication;

import com.lp.toutiao.utils.MyLogImp;

/**
 * Create by lp on 2019/06/28
 */

public class MyApp extends MultiDexApplication {
    private static final String TAG = MyApp.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();
        MyLogImp.d(TAG,"");
    }
}
