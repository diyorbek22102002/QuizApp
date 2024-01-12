package com.example.data.repository

import com.example.data.api.RemoteDataSource
import com.example.data.api.model.storeg.QuestionDataResults
import com.example.data.api.model.storeg.QuestionsData
import com.example.data.api.model.storeg.TriviaCategories
import com.example.utils.BaseApiResponse
import com.example.utils.NetworkResults
import javax.inject.Inject

class GetQuestionRepositoryApi @Inject constructor(private val remoteDataSource: RemoteDataSource) :
    BaseApiResponse() {

    suspend fun getQuestion(
        amount: Int,
        category: String,
        difficulty: String
    ): NetworkResults<QuestionDataResults> {
        return safeApiCall {
            remoteDataSource.getAllQuestion(
                amount = amount,
                category = category,
                difficulty = difficulty
            )
        }
    }

    suspend fun getCategory(): NetworkResults<TriviaCategories> {
        return safeApiCall { remoteDataSource.getCategory() }
    }


}