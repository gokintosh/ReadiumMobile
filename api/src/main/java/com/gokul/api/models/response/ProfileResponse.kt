package com.gokul.api.models.response


import com.gokul.api.models.entities.Profile
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProfileResponse(
    @Json(name = "profile")
    val profile: Profile
)