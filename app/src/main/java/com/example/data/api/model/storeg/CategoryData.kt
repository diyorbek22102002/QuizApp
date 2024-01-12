package com.example.data.api.model.storeg

import com.google.gson.annotations.SerializedName

data class CategoryData(
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("name")
    val name: String? = null
)