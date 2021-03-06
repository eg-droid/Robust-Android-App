package com.ahmedadel.robustandroid.presentation.mvvm.home.di

import androidx.lifecycle.ViewModel
import com.ahmedadel.robustandroid.core.di.PresentationScope
import com.ahmedadel.robustandroid.core.di.ViewModelKey
import com.ahmedadel.robustandroid.presentation.mvvm.home.HomeViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * Created at Tito on 3/16/19
 */

@Module
abstract class HomeViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    @PresentationScope
    internal abstract fun provideHomeViewModel(homeViewModel: HomeViewModel): ViewModel

}
