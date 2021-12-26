package com.gokul.api.models.request


import com.gokul.api.models.entities.LoginCred
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LoginRequest(
    @Json(name = "user")
    val loginCred: LoginCred
)