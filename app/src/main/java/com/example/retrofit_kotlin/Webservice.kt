package com.example.retrofit_kotlin

import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

const val BASE_URL = "https://api.mrmusllaha.com/"

abstract class Webservice {


    @POST(value = "v1/register/sendotp")
    suspend fun registration(@Body request: RegistrationRequest, @Header("Authorization") BasicAuth: String) {
    }


}

