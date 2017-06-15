package com.kickstart.application.di.component;

import com.kickstart.application.di.module.ActivityModule;
import com.kickstart.application.di.scope.PerActivity;
import com.kickstart.application.ui.BaseActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * To maintain activity-level object graph. Scope of this component lives during
 * an activity lifecycle.
 * <p>
 * A base component upon which fragment-level components may depend.
 * <p>
 * Uses scope {@link com.bootstrap.application.di.scope.PerActivity}
 */
@PerActivity
@Subcomponent(modules = {
        ActivityModule.class,
})
public interface ActivityComponent extends AndroidInjector<BaseActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<BaseActivity> {
        abstract Builder activityModule(ActivityModule module);

        @Override
        public void seedInstance(BaseActivity activity) {
            activityModule(new ActivityModule(activity));
        }
    }
}
