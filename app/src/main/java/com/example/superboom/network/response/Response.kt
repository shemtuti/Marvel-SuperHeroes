package com.example.superboom.network.response

import com.example.superboom.data.Data

data class Response(
    val code: Int,
    val etag: String,
    val data: Data
)