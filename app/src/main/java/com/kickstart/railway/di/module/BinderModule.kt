package com.kickstart.railway.di.module

import android.app.Activity
import android.support.v4.app.Fragment

import com.kickstart.railway.di.component.ActivityComponent
import com.kickstart.railway.di.component.FragmentComponent
import com.kickstart.railway.ui.BaseActivity
import com.kickstart.railway.ui.BaseFragment

import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.android.support.FragmentKey
import dagger.multibindings.IntoMap

/**
 * A module to bind component hierarchy.
 */
@Module
abstract class BinderModule {
    @Binds
    @IntoMap
    @ActivityKey(BaseActivity::class)
    internal abstract fun bindBaseActivityInjectorFactory(builder: ActivityComponent.Builder): AndroidInjector.Factory<out Activity>

    @Binds
    @IntoMap
    @FragmentKey(BaseFragment::class)
    internal abstract fun bindFragmentInjectorFactory(builder: FragmentComponent.Builder): AndroidInjector.Factory<out Fragment>
}
