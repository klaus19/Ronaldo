package com.tejas.ronaldo.retrofit

import retrofit2.http.GET

interface NameApi {

      @GET("name")
     suspend fun getNationality():List<Country>

}