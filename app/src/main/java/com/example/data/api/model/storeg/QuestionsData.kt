package com.example.data.api.model.storeg

import com.google.gson.annotations.SerializedName

data class QuestionsData(
    @SerializedName("type")
    val type: String? = null,
    @SerializedName("difficulty")
    val difficulty: String? = null,
    @SerializedName("category")
    val category: String? = null,
    @SerializedName("question")
    val question: String? = null,
    @SerializedName("correct_answer")
    val correctAnswer: String? = null,
    @SerializedName("incorrect_answers")
    val incorrectAnswers: List<String>? = null
)
