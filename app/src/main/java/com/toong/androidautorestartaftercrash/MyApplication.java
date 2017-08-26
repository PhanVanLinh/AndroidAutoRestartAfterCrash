package com.toong.androidautorestartaftercrash;

import android.app.Application;
import android.content.Context;

/**
 * Created by PhanVanLinh on 26/08/2017.
 * phanvanlinh.94vn@gmail.com
 */

public class MyApplication extends Application{
    public static MyApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
    @Override
    public Context getApplicationContext() {
        return super.getApplicationContext();
    }
    public static MyApplication getInstance() {
        return instance;
    }
}
