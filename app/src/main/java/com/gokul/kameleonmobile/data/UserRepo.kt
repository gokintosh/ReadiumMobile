package com.gokul.kameleonmobile.data

import com.gokul.api.KamClient
import com.gokul.api.models.entities.LoginCred
import com.gokul.api.models.request.LoginRequest
import com.gokul.api.models.response.UserResponse

object UserRepo {
    val api= KamClient().api

    suspend fun login(email:String,password:String): UserResponse? {
        val response=api.loginUser(LoginRequest(LoginCred(email,password)))
        return response.body()
    }
}