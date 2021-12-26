package com.gokul.api

import com.gokul.api.models.request.SignUpRequest
import com.gokul.api.models.entities.SignUpCreds
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test
import kotlin.random.Random


class KAMapitest {

    private val kamClient=KamClient()

    @Test
    fun `get articles`(){

        runBlocking {
            val articles=kamClient.api.getArticles()
            assertNotNull(articles.body()?.articles)
        }

    }

    @Test
    fun `get articles by author`(){

        runBlocking {
            val articles=kamClient.api.getArticles(author="Gerome")
            assertNotNull(articles.body()?.articles)
        }

    }

    @Test
    fun `get articles by tags`(){

        runBlocking {
            val articles=kamClient.api.getArticles(tags= listOf("welcome"))
            assertNotNull(articles.body()?.articles)
        }

    }

    @Test
    fun `Post users -create users`(){
        val userCreds= SignUpCreds(
            "testemail${Random.nextInt(999,9999)}@gmail.com",
            "${Random.nextInt(99999,9999999)}",
            "randomname${Random.nextInt(66,99)}"
        )
        runBlocking {

            val resp=kamClient.api.signupUser(SignUpRequest(userCreds))

            assertEquals(userCreds.username,resp.body()?.user?.username)
        }
    }
}
