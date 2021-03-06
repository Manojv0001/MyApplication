package com.example.myapplication.di.modules

import android.content.Context
import com.example.myapplication.util.annotations.ApplicationScope
import com.example.myapplication.util.annotations.qualifier.ApplicationContext
import dagger.Module
import dagger.Provides


@Module
class ContextModule(private val context: Context) {

    /**
     * provides the context
     */
    @Provides
    @ApplicationScope
    @ApplicationContext
    fun provideContext(): Context {
        return context
    }

}