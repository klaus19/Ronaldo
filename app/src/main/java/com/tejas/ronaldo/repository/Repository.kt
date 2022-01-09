package com.tejas.ronaldo.repository

import com.tejas.ronaldo.api.RetrofitInstance
import com.tejas.ronaldo.model.Country

class Repository {



    suspend fun getNationality2(names:String):Country{

        return RetrofitInstance.api.getNationality2(names)
    }
}