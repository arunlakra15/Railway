package com.kickstart.application.di.module;


import com.kickstart.application.di.component.FragmentComponent;
import com.kickstart.application.di.scope.PerActivity;
import com.kickstart.application.ui.BaseActivity;

import dagger.Module;
import dagger.Provides;

/**
 * A module to expose the objects in the activity state to activity-level
 * object graph.
 */
@Module(subcomponents = {FragmentComponent.class})
public class ActivityModule {
    private final BaseActivity mActivity;

    public ActivityModule(BaseActivity activity) {
        mActivity = activity;
    }

    @Provides
    @PerActivity
    BaseActivity provideActivity() {
        return mActivity;
    }
}
