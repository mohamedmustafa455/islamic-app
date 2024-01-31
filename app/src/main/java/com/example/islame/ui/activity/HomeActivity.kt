package com.example.islame.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.islame.R
import com.example.islame.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    lateinit var  binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_home)

         binding  = DataBindingUtil.setContentView(this, R.layout.activity_home)
        val viewModel = HomeViewModel()
        binding.viewModel = viewModel




    }
}