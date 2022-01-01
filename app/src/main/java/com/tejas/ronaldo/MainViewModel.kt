package com.tejas.ronaldo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tejas.ronaldo.model.Country
import com.tejas.ronaldo.repository.Repository
import kotlinx.coroutines.launch

class MainViewModel(private val repository: Repository): ViewModel() {

    val myResponse:MutableLiveData<Country> = MutableLiveData()

    fun getNationality(){
        viewModelScope.launch {
            val response = repository.getNationality()
            myResponse.value = response

        }
    }

}