package com.kickstart.railway.di.module


import com.kickstart.railway.di.component.FragmentComponent
import com.kickstart.railway.di.scope.PerActivity
import com.kickstart.railway.ui.BaseActivity

import dagger.Module
import dagger.Provides

/**
 * A module to expose the objects in the activity state to activity-level
 * object graph.
 */
@Module(subcomponents = arrayOf(FragmentComponent::class))
class ActivityModule(private val mActivity: BaseActivity) {

    @Provides
    @PerActivity
    internal fun provideActivity(): BaseActivity {
        return mActivity
    }
}
