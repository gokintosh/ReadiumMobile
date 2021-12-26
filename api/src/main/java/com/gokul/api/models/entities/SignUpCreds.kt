package com.gokul.api.models.entities


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SignUpCreds(
    @Json(name = "email")
    val email: String,
    @Json(name = "password")
    val password: String,
    @Json(name = "username")
    val username: String
)