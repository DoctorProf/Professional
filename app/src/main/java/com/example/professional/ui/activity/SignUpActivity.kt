package com.example.professional.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.professional.databinding.SignupBinding
import com.example.professional.ui.viewmodel.SignUpViewModel

class SignUpActivity : AppCompatActivity() {

    private lateinit var binding: SignupBinding
    private val viewModel : SignUpViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSignUp.setOnClickListener() {
            startActivity(Intent(this, HomeActivity::class.java))
        }
        binding.textViewSignIn.setOnClickListener() {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}