package com.example.qyou.network

import com.example.qyou.model.Question
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface QuestionAPI {

    @GET("world.json")
    suspend fun getAllQuestions(): Question
}