package com.example.professional.ui.activity

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.professional.databinding.HomeBinding
import com.example.professional.databinding.LoginBinding
import com.example.professional.ui.viewmodel.LoginViewModel

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: HomeBinding
    private val viewModel: LoginViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}