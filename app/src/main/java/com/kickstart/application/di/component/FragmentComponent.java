package com.kickstart.application.di.component;

import com.kickstart.application.di.module.FragmentModule;
import com.kickstart.application.di.scope.PerFragment;
import com.kickstart.application.ui.BaseFragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * To maintain activity-level object graph. Scope of this component lives during
 * a fragment lifecycle.
 *
 * A base component upon which view/presenter-level components may depend.
 *
 * Uses scope {@link com.bootstrap.application.di.scope.PerActivity}
 */
@PerFragment
@Subcomponent(modules = {FragmentModule.class})
public interface FragmentComponent extends AndroidInjector<BaseFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<BaseFragment> {
        abstract Builder fragmentModule(FragmentModule module);

        @Override
        public void seedInstance(BaseFragment fragment) {
            fragmentModule(new FragmentModule(fragment));
        }
    }
}

