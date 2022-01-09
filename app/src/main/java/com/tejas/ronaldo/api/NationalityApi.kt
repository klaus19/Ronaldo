package com.tejas.ronaldo.api

import com.tejas.ronaldo.model.Country
import okhttp3.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface NationalityApi {



   @GET("?name={names}")
   suspend fun getNationality2(
       @Path("names") names:String
   ):Country

   @GET("?name")
   suspend fun getNationalityList(
       @Query
   ):Response<List<Country>>
}