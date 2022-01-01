package com.tejas.ronaldo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.tejas.ronaldo.databinding.ActivityMainBinding
import com.tejas.ronaldo.repository.Repository


class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    private val TAG:String = "Main"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        val respository = Repository()
        val viewModelFactory = MainViewModelFactory(respository)

        viewModel = ViewModelProvider(this,viewModelFactory).get(MainViewModel::class.java)
        viewModel.getNationality()
        viewModel.myResponse.observe(this, Observer {

            Log.d(TAG, it.country.toString())

        })


    }
}