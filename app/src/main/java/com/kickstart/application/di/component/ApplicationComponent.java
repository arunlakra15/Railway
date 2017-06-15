package com.kickstart.application.di.component;


import com.kickstart.application.AndroidApplication;
import com.kickstart.application.di.module.ApplicationModule;
import com.kickstart.application.di.module.BinderModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Lifetime is throughout the application lifecycle.
 */
@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        ApplicationModule.class,
        BinderModule.class
})
public interface ApplicationComponent {
    void inject(AndroidApplication androidApplication);
}
