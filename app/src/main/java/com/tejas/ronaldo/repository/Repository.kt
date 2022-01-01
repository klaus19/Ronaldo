package com.tejas.ronaldo.repository

import com.tejas.ronaldo.api.RetrofitInstance
import com.tejas.ronaldo.model.Country

class Repository {

    suspend fun getNationality(): Country{
       return RetrofitInstance.api.getNationality()
    }
}