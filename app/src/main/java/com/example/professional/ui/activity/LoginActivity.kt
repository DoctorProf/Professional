package com.example.professional.ui.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.professional.databinding.LoginBinding
import com.example.professional.ui.viewmodel.LoginViewModel

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: LoginBinding
    private val viewModel: LoginViewModel  by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLogin.setOnClickListener() {
            val email = binding.editTextEmail.text.toString()
            val password = binding.editTextPassword.text.toString()

            if (viewModel.validateCredentials(email, password)) {
                navigateToHome()
            } else {
                Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show()
            }
        }


    }
    private fun navigateToHome() {
        startActivity(Intent(this, HomeActivity::class.java))
    }
}