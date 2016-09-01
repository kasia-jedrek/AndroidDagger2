package com.test.tested.dagger;

import com.test.tested.base.MyApp;
import com.test.tested.dagger.component.AppComponent;
import com.test.tested.dagger.component.DaggerAppComponent;
import com.test.tested.dagger.module.AppModule;
import com.test.tested.dagger.module.SharedPrefsModule;

import java.util.Objects;


public class Injector {

    private static AppComponent applicationComponent;

    private Injector() {}

    public static void initializeApplicationComponent(MyApp app) {
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
