package com.kickstart.railway.di.module

import android.content.Context

import com.kickstart.railway.AndroidApplication
import com.kickstart.railway.di.component.ActivityComponent

import javax.inject.Singleton

import dagger.Module
import dagger.Provides

/**
 * Module which provides objects which will live throughout the application lifecycle.
 */
@Module(subcomponents = arrayOf(ActivityComponent::class))
class ApplicationModule(private val mApplication: AndroidApplication) {

    @Provides
    @Singleton
    internal fun provideApplicationContext(): Context {
        return this.mApplication
    }
}
