package com.kickstart.railway.di.component


import com.kickstart.railway.AndroidApplication
import com.kickstart.railway.di.module.ApplicationModule
import com.kickstart.railway.di.module.BinderModule

import javax.inject.Singleton

import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule

/**
 * Lifetime is throughout the application lifecycle.
 */
@Singleton
@Component(modules = arrayOf(AndroidSupportInjectionModule::class, ApplicationModule::class, BinderModule::class))
interface ApplicationComponent {
    fun inject(androidApplication: AndroidApplication)
}
