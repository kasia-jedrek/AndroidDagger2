package com.test.test.dagger.module.component;

import com.test.test.MainActivity;
import com.test.test.dagger.module.AppModule;
import com.test.test.dagger.module.SharedPrefsModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Katarzyna Jedrzejewska on 2016-08-31.
 */
@Singleton
@Component(modules={AppModule.class, SharedPrefsModule.class})
public interface  AppComponent {
    //Dagger 2 - strong typed classes
    void inject(MainActivity activity);
}
