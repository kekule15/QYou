package com.example.qyou.di

import com.example.qyou.network.QuestionAPI
import com.example.qyou.repository.QuestionRepository
import com.example.qyou.util.Constants
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun providesQuestionRepository(api: QuestionAPI) = QuestionRepository(api)
    @Singleton
    @Provides
    fun providesQuestionAPI(): QuestionAPI{
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(QuestionAPI::class.java)
    }

}