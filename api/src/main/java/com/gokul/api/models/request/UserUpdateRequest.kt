package com.gokul.api.models.request


import com.gokul.api.models.entities.UpdateUserCreds
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UserUpdateRequest(
    @Json(name = "user")
    val updateUserCreds: UpdateUserCreds
)