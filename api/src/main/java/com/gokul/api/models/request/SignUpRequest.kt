package com.gokul.api.models.request


import com.gokul.api.models.entities.SignUpCreds
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SignUpRequest(
    @Json(name = "user")
    val signUp: SignUpCreds
)