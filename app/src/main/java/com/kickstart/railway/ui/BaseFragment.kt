package com.kickstart.railway.ui

import android.arch.lifecycle.LifecycleFragment
import android.content.Context

import dagger.android.support.AndroidSupportInjection

abstract class BaseFragment : LifecycleFragment() {
    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }
}
