package com.kickstart.railway.ui

import android.os.Bundle
import android.os.PersistableBundle
import com.kickstart.railway.R

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        setContentView(R.layout.activity_home)
    }
}