package com.example.myapplication.di.component

import com.example.myapplication.App
import com.example.myapplication.di.modules.ApiModule
import com.example.myapplication.di.modules.DataBaseModule
import com.example.myapplication.di.modules.ViewModelModule
import com.example.myapplication.ui.detail.DetailActivity
import com.example.myapplication.ui.home.HomeActivity
import com.example.myapplication.ui.login.LoginActivity
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class, ViewModelModule::class, ApiModule::class, DataBaseModule::class]
)
interface ApplicationComponent : AndroidInjector<App> {
    //activity and fragment injections
    fun inject(homeActivity: HomeActivity)

    fun inject(detailActivity: DetailActivity)

    fun inject(loginActivity: LoginActivity)


    @Component.Factory
    interface Factory {
        fun create(@BindsInstance app: App): ApplicationComponent
    }

}