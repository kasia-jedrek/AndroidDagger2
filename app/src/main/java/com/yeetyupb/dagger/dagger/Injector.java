package com.yeetyupb.dagger.dagger;


import android.app.Application;

import com.yeetyupb.dagger.dagger.component.AppComponent;
import com.yeetyupb.dagger.dagger.component.DaggerAppComponent;
import com.yeetyupb.dagger.dagger.module.AppModule;
import com.yeetyupb.dagger.dagger.module.SharedPrefsModule;

import java.util.Objects;


public class Injector {

    private static AppComponent applicationComponent;

    private Injector() {}

    public static void initializeApplicationComponent(Application app) {
        applicationComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(app))
                .sharedPrefsModule(new SharedPrefsModule())
                .build();
    }

    public static AppComponent getAppComponent() {
        Objects.requireNonNull(applicationComponent, "applicationComponent is null");
        return applicationComponent;
    }
}
