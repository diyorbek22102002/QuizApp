package com.example.data.api

import com.example.data.api.model.storeg.QuestionDataResults
import com.example.data.api.model.storeg.TriviaCategories
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface QuestionService {

    @GET("/api.php")
    suspend fun getAllAmount(
        @Query("amount") amount: Int,
        @Query("category") category: String,
        @Query("difficulty") difficulty: String,
    ): Response<QuestionDataResults>


    @GET("/api_category.php")
    suspend fun getCategory(): Response<TriviaCategories>

}