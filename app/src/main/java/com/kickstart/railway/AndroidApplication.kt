package com.kickstart.railway

import android.app.Activity
import android.app.Application

import com.kickstart.railway.di.component.ApplicationComponent
import com.kickstart.railway.di.component.DaggerApplicationComponent
import com.kickstart.railway.di.module.ApplicationModule

import javax.inject.Inject

import dagger.android.DispatchingAndroidInjector
import dagger.android.HasDispatchingActivityInjector

/**
 * Main Application
 */
class AndroidApplication : Application(), HasDispatchingActivityInjector {
    var applicationComponent: ApplicationComponent? = null
        private set

    @Inject
    lateinit internal var mDispatchingActivityInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()

        this.initializeInjector()
    }

    private fun initializeInjector() {
        this.applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
        this.applicationComponent!!.inject(this)
    }

    override fun activityInjector(): DispatchingAndroidInjector<Activity> {
        return mDispatchingActivityInjector
    }
}
