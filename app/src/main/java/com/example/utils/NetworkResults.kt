package com.example.utils

sealed class NetworkResults<T>(
    val data: T? = null,
    val message: String? = null
) {

    class Success<T>(data: T?) : NetworkResults<T>(data = data)
    class Error<T>(data: T?, message: String?) : NetworkResults<T>(data = data, message = message)
    class Loading<T>() : NetworkResults<T>()


}