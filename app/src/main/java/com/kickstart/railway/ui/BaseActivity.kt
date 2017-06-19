package com.kickstart.railway.ui

import android.arch.lifecycle.LifecycleActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.app.Fragment

import javax.inject.Inject

import dagger.android.AndroidInjection
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasDispatchingSupportFragmentInjector

abstract class BaseActivity : LifecycleActivity(), HasDispatchingSupportFragmentInjector {
    @Inject
    lateinit internal var mFragmentInjector: DispatchingAndroidInjector<Fragment>

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState, persistentState)
    }

    override fun supportFragmentInjector(): DispatchingAndroidInjector<Fragment> {
        return mFragmentInjector
    }
}
