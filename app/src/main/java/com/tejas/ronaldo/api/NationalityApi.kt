package com.tejas.ronaldo.api

import com.tejas.ronaldo.model.Country
import com.tejas.ronaldo.model.CountryX
import okhttp3.Response
import retrofit2.http.GET

interface NationalityApi {

    @GET("?name=Mike")
   suspend fun getNationality():Country
}