package com.gokul.api.models.request


import com.gokul.api.models.entities.ArticleData
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateArticleRequest(
    @Json(name = "article")
    val articleData: ArticleData
)