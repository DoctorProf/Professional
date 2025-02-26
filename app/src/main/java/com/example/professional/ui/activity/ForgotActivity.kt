package com.example.professional.ui.activity

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.professional.databinding.ForgotPasswordBinding
import com.example.professional.databinding.VerificationBinding
import com.example.professional.ui.viewmodel.ForgotPasswordViewModel
import com.example.professional.ui.viewmodel.SignUpViewModel

class ForgotActivity : AppCompatActivity() {

    private lateinit var binding: ForgotPasswordBinding
    private val viewModel : ForgotPasswordViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ForgotPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}