package com.kickstart.application.di.module;

import android.content.Context;

import com.kickstart.application.AndroidApplication;
import com.kickstart.application.di.component.ActivityComponent;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Module which provides objects which will live throughout the application lifecycle.
 */
@Module(subcomponents = {ActivityComponent.class})
public class ApplicationModule {
    private final AndroidApplication mApplication;

    public ApplicationModule(AndroidApplication application) {
        this.mApplication = application;
    }

    @Provides @Singleton
    Context provideApplicationContext() {
        return this.mApplication;
    }
}
