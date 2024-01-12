package com.example.domain.usecases

import com.example.data.api.model.storeg.QuestionDataResults
import com.example.data.repository.GetQuestionRepositoryApi
import com.example.utils.NetworkResults
import javax.inject.Inject

class GetAllQuestionUseCase @Inject constructor(private val getRepository: GetQuestionRepositoryApi) {
    // Getting data from GetQuestionRepositoryApi GetAllQuestion
    suspend fun invoke(
        amount: Int,
        category: String,
        difficulty: String
    ): NetworkResults<QuestionDataResults> {
        return getRepository.getQuestion(
            amount = amount,
            category = category,
            difficulty = difficulty
        )
    }
}