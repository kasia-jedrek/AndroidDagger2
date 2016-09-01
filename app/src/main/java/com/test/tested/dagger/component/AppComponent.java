package com.test.tested.dagger.component;

import com.test.tested.activity.MainActivity;
import com.test.tested.base.MyApp;
import com.test.tested.dagger.module.AppModule;
import com.test.tested.dagger.module.SharedPrefsModule;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules={AppModule.class, SharedPrefsModule.class})
public interface  AppComponent {
    //Dagger 2 - strong typed classes
    void inject(MainActivity activity);
    void inject(MyApp app);
}
