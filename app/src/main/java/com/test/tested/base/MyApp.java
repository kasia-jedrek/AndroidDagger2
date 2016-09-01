package com.test.tested.base;

import android.app.Application;

import com.test.tested.dagger.Injector;


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
