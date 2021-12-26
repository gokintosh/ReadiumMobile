package com.gokul.api.models.response


import com.gokul.api.models.entities.Error
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ErrorResponse(
    @Json(name = "errors")
    val errors: Error
)