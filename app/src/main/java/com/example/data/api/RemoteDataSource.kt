package com.example.data.api

import javax.inject.Inject

class RemoteDataSource @Inject constructor(private val questionService: QuestionService) {

    suspend fun getAllQuestion(amount: Int, category: String, difficulty: String) =
        questionService.getAllAmount(amount = amount, category = category, difficulty = difficulty)


    suspend fun getCategory() = questionService.getCategory()
}