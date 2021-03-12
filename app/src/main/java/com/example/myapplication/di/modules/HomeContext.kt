package com.example.myapplication.di.modules

import android.content.Context
import com.example.myapplication.ui.home.HomeActivity
import com.example.myapplication.util.annotations.ActivityScope
import com.example.myapplication.util.annotations.qualifier.ActivityContext
import dagger.Module
import dagger.Provides


@Module
class MainActivityContextModule(private val mainActivity: HomeActivity) {
    var context: Context = mainActivity

    /**
     * provides the HomeActivity
     */
    @Provides
    @ActivityScope
    fun providesHomeActivity(): HomeActivity {
        return mainActivity
    }

    /**
     * Provides the context
     */
    @Provides
    @ActivityScope
    @ActivityContext
    fun provideContext(): Context {
        return context
    }

}