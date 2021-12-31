package com.tejas.ronaldo.repository

import com.tejas.ronaldo.retrofit.Country
import com.tejas.ronaldo.retrofit.RetrofitInstance


class NationalityRepository {

    suspend fun getNationality(): List<Country> {
        return RetrofitInstance.api.getNationality()
    }
}