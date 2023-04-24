package com.example.qyou.data

data class DataOrException<T, Boolean, E : Exception>(
    val data: T? = null,
    val loading: Boolean? = null,
    val e: Exception? = null,
)