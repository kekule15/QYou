package com.example.qyou.repository

import com.example.qyou.data.DataOrException
import com.example.qyou.model.QuestionItem
import com.example.qyou.network.QuestionAPI
import javax.inject.Inject

class QuestionRepository @Inject constructor(private val api: QuestionAPI) {
    private val dataOrException = DataOrException<ArrayList<QuestionItem>, Boolean, Exception>()


}