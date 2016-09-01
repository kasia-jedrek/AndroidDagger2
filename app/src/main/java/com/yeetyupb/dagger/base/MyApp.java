package com.yeetyupb.dagger.base;

import android.app.Application;

import com.yeetyupb.dagger.dagger.Injector;


public class MyApp extends Application {
    private static final String TAG = "MyApp";

    public MyApp() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Injector.initializeApplicationComponent(this);
    }
}
