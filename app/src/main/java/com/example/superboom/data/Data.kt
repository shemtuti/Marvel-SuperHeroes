package com.example.superboom.data

import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("count")
    val count: Int,

    @SerializedName("limit")
    val limit: Int,

    @SerializedName("offset")
    val offset: Int,

    @SerializedName("results")
    val results: List<MarvelCharacters>,

    @SerializedName("total")
    val total: Int
)