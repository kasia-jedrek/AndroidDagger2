package com.yeetyupb.dagger.dagger.component;


import com.yeetyupb.dagger.activity.MainActivity;
import com.yeetyupb.dagger.base.MyApp;
import com.yeetyupb.dagger.dagger.module.AppModule;
import com.yeetyupb.dagger.dagger.module.SharedPrefsModule;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules={AppModule.class, SharedPrefsModule.class})
public interface  AppComponent {
    //Dagger 2 - strong typed classes
    void inject(MainActivity activity);
    void inject(MyApp app);
}
