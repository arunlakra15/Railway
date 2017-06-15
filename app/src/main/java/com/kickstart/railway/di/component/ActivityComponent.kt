package com.kickstart.railway.di.component

import com.kickstart.railway.di.module.ActivityModule
import com.kickstart.railway.di.scope.PerActivity
import com.kickstart.railway.ui.BaseActivity

import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * To maintain activity-level object graph. Scope of this component lives during
 * an activity lifecycle.
 *
 *
 * A base component upon which fragment-level components may depend.
 *
 *
 * Uses scope [com.bootstrap.application.di.scope.PerActivity]
 */
@PerActivity
@Subcomponent(modules = arrayOf(ActivityModule::class))
interface ActivityComponent : AndroidInjector<BaseActivity> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<BaseActivity>() {
        internal abstract fun activityModule(module: ActivityModule): Builder

        override fun seedInstance(activity: BaseActivity) {
            activityModule(ActivityModule(activity))
        }
    }
}
