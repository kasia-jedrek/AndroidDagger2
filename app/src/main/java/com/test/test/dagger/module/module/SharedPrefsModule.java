package com.test.test.dagger.module.module;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Katarzyna Jedrzejewska on 2016-08-31.
 */
@Module
public class SharedPrefsModule {
    private static final String TAG = "SharedPrefsModule";

    public SharedPrefsModule() {
    }

    // Dagger will only look for methods annotated with @Provides
    @Provides
    @Singleton
    // Application reference must come from AppModule.class
    SharedPreferences providesSharedPreferences(Application application) {
        return PreferenceManager.getDefaultSharedPreferences(application);
    }
}
