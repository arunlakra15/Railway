package com.kickstart.application.di.module;

import com.kickstart.application.di.scope.PerActivity;
import com.kickstart.application.ui.BaseFragment;

import dagger.Module;
import dagger.Provides;

/**
 * A module to expose the objects in the fragment state to fragment-level
 * object graph.
 */
@Module
public class FragmentModule {
    private final BaseFragment mFragment;

    public FragmentModule(BaseFragment fragment) {
        mFragment = fragment;
    }

    @Provides
    @PerActivity
    BaseFragment provideFragment() {
        return mFragment;
    }
}

