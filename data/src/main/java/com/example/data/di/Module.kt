package com.example.data.di

import com.example.data.local.NewsListDao
import com.example.data.network_service.ApiService
import com.example.data.repository.NewsRepositoryImpl
import com.example.domain.model.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent


@Module
@InstallIn(ViewModelComponent::class)
object LoginModule {


    @Provides
    fun provideNewsRepository(apiService: ApiService, newsListDao: NewsListDao): NewsRepository {
        return NewsRepositoryImpl(apiService, newsListDao)
    }

}