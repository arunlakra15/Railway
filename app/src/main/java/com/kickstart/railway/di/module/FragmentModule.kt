package com.kickstart.railway.di.module

import com.kickstart.railway.di.scope.PerActivity
import com.kickstart.railway.ui.BaseFragment

import dagger.Module
import dagger.Provides

/**
 * A module to expose the objects in the fragment state to fragment-level
 * object graph.
 */
@Module
class FragmentModule(private val mFragment: BaseFragment) {

    @Provides
    @PerActivity
    internal fun provideFragment(): BaseFragment {
        return mFragment
    }
}

