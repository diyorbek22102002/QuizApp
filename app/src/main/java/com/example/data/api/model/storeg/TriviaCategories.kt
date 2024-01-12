package com.example.data.api.model.storeg

import com.google.gson.annotations.SerializedName

data class TriviaCategories(
    @SerializedName("trivia_categories")
    val TriviaCategories: List<CategoryData>? = null
)
