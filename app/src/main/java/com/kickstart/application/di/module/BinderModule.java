package com.kickstart.application.di.module;

import android.app.Activity;
import android.support.v4.app.Fragment;

import com.kickstart.application.di.component.ActivityComponent;
import com.kickstart.application.di.component.FragmentComponent;
import com.kickstart.application.ui.BaseActivity;
import com.kickstart.application.ui.BaseFragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

/**
 * A module to bind component hierarchy.
 */
@Module
public abstract class BinderModule {
    @Binds
    @IntoMap @ActivityKey(BaseActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindBaseActivityInjectorFactory(ActivityComponent.Builder builder);

    @Binds @IntoMap @FragmentKey(BaseFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> bindFragmentInjectorFactory(FragmentComponent.Builder builder);
}
