package com.example.qyou.repository

import android.util.Log
import com.example.qyou.data.DataOrException
import com.example.qyou.model.QuestionItem
import com.example.qyou.network.QuestionAPI
import javax.inject.Inject

class QuestionRepository @Inject constructor(private val api: QuestionAPI) {
    private var dataOrException = DataOrException<ArrayList<QuestionItem>, Boolean, Exception>()

    suspend fun getAllQuestions(): DataOrException<ArrayList<QuestionItem>, Boolean, Exception> {

        try {
            dataOrException.loading = true;
            dataOrException.data = api.getAllQuestions();
            if (dataOrException.data.toString().isNotEmpty()) dataOrException.loading = false
        } catch (exception: java.lang.Exception) {
            dataOrException.e = exception
            Log.d("Exception", "getAllQuestions error: ${dataOrException.e}")

        }

        return dataOrException
    }
}