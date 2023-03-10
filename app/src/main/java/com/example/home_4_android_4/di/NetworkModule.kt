package com.example.home_4_android_4.di

import com.example.home_4_android_4.data.remote.RetrofitClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideRetrofitClient() = RetrofitClient()

    @Singleton
    @Provides
    fun provideVideoCategoryApiService(retrofitClient: RetrofitClient) = retrofitClient.provideVideoPopularApiService()

}