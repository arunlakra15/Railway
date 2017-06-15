package com.kickstart.railway.di.component

import com.kickstart.railway.di.module.FragmentModule
import com.kickstart.railway.di.scope.PerFragment
import com.kickstart.railway.ui.BaseFragment

import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * To maintain activity-level object graph. Scope of this component lives during
 * a fragment lifecycle.

 * A base component upon which view/presenter-level components may depend.

 * Uses scope [com.bootstrap.application.di.scope.PerActivity]
 */
@PerFragment
@Subcomponent(modules = arrayOf(FragmentModule::class))
interface FragmentComponent : AndroidInjector<BaseFragment> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<BaseFragment>() {
        internal abstract fun fragmentModule(module: FragmentModule): Builder

        override fun seedInstance(fragment: BaseFragment) {
            fragmentModule(FragmentModule(fragment))
        }
    }
}

