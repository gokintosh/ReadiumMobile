package com.gokul.api.models.response


import com.gokul.api.models.entities.Comment
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CommentsResponse(
    @Json(name = "comments")
    val comments: List<Comment>
)