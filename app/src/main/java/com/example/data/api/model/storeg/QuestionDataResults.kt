package com.example.data.api.model.storeg

import com.example.data.api.model.storeg.QuestionsData
import com.google.gson.annotations.SerializedName

data class QuestionDataResults(
    @SerializedName("results")
    val results: ArrayList<QuestionsData>? = null
)
