package com.example.utils

import retrofit2.Response

abstract class BaseApiResponse {

    suspend fun <T> safeApiCall(api: suspend () -> Response<T>): NetworkResults<T> {

        try {
            val response = api()
            if (response.isSuccessful) {
                val body = response.body()
                body?.let {
                    return NetworkResults.Success(body)
                } ?: return errorMessage("body is empty")
            } else {
                return errorMessage(" ${response.code()} ${response.message()}")
            }

        } catch (e: Exception) {
            return errorMessage(e.toString())
        }
    }

    private fun <T> errorMessage(e: String): NetworkResults.Error<T> {
        return NetworkResults.Error(
            data = null,
            message = "Api call failed $e"
        )
    }
}