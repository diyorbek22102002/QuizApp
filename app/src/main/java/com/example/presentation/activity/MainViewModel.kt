package com.example.presentation.activity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.api.model.storeg.QuestionDataResults
import com.example.data.api.model.storeg.TriviaCategories
import com.example.domain.usecases.GetAllQuestionUseCase
import com.example.domain.usecases.GetCategoryUseCase
import com.example.utils.NetworkResults
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getAllQuestionUseCase: GetAllQuestionUseCase,
    private val getCategoryUseCase: GetCategoryUseCase
) : ViewModel() {

    private val _getAllQuestionResponse = MutableLiveData<NetworkResults<QuestionDataResults>>()

    val getAllQuestionResponse: LiveData<NetworkResults<QuestionDataResults>>
        get() = _getAllQuestionResponse


    private val _getCategoryResponse = MutableLiveData<NetworkResults<TriviaCategories>>()

    val getCategoryResponse: LiveData<NetworkResults<TriviaCategories>>
        get() = _getCategoryResponse


    init {
        getQuestionResponse(1, "", "")
        getCategory()
    }


    private fun getQuestionResponse(amount: Int, category: String, difficulty: String) {
        viewModelScope.launch {

            getAllQuestionUseCase.invoke(
                amount = amount,
                category = category,
                difficulty = difficulty
            ).let {
                _getAllQuestionResponse.value = it
            }
        }

    }

    private fun getCategory() {
        viewModelScope.launch {
            getCategoryUseCase.invoke().let {
                _getCategoryResponse.value = it
            }
        }
    }
}
