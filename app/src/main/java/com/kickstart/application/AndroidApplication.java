package com.kickstart.application;

import android.app.Activity;
import android.app.Application;

import com.kickstart.application.di.component.ApplicationComponent;
import com.kickstart.application.di.component.DaggerApplicationComponent;
import com.kickstart.application.di.module.ApplicationModule;

import javax.inject.Inject;

import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasDispatchingActivityInjector;

/**
 * Main Application
 */
public class AndroidApplication extends Application implements HasDispatchingActivityInjector {
    private ApplicationComponent mApplicationComponent;

    @Inject
    DispatchingAndroidInjector<Activity> mDispatchingActivityInjector;

    @Override
    public void onCreate() {
        super.onCreate();

        this.initializeInjector();
    }

    private void initializeInjector() {
        this.mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        this.mApplicationComponent.inject(this);
    }

    public ApplicationComponent getApplicationComponent() {
        return this.mApplicationComponent;
    }

    @Override
    public DispatchingAndroidInjector<Activity> activityInjector() {
        return mDispatchingActivityInjector;
    }
}
