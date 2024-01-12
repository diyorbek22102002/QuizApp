package com.example.domain.usecases

import com.example.data.api.model.storeg.TriviaCategories
import com.example.data.repository.GetQuestionRepositoryApi
import com.example.utils.NetworkResults
import javax.inject.Inject

class GetCategoryUseCase @Inject constructor(private val getRepository: GetQuestionRepositoryApi) {

    // Getting data from GetQuestionRepository  Category
    suspend fun invoke(): NetworkResults<TriviaCategories> {
        return getRepository.getCategory()
    }
}