package com.tejas.ronaldo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.tejas.ronaldo.repository.Repository

class MainViewModelFactory(private val respository:Repository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(respository)as T
    }


}