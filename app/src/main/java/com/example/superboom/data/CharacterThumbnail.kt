package com.example.superboom.data

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CharacterThumbnail(

    @SerializedName("path")
    val path: String,

    @SerializedName("extension")
    val extension: String

): Parcelable