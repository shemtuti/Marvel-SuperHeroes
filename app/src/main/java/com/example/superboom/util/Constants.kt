package com.example.superboom.util

import java.math.BigInteger
import java.security.MessageDigest
import java.sql.Timestamp

object Constants {
    const val BASE_URL = "https://gateway.marvel.com:443/"
    val timeStamp = Timestamp(System.currentTimeMillis()).time.toString()
    const val API_KEY = "063a6d6037d47e442ee28f91d4f287ea"
    private const val PRIVATE_KEY = "38662d72eceafe470020ceaab9d68d277232824d"
    const val limit = "25"

    fun hash(): String {
        val input = "$timeStamp$PRIVATE_KEY$API_KEY"
        val md = MessageDigest.getInstance("MD5")
        return BigInteger(1, md.digest(input.toByteArray())).toString(16).padStart(32, '0')
    }

}