package com.seguras.newsapi

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {
    @GET
    suspend fun getResponse(@Url url: String): Response<Respuesta>
}