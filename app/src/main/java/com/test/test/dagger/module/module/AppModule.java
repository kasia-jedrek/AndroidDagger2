package com.test.test.dagger.module.module;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Katarzyna Jedrzejewska on 2016-08-31.
 */
@Module
public class AppModule {
    private static final String TAG = "AppModule";

    Application mApplication;

    public AppModule(Application application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    Application providesApplication() {
        return mApplication;
    }
}
