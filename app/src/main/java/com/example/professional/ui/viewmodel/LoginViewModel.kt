package com.example.professional.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.professional.utils.ValidationUtils

class LoginViewModel : ViewModel() {

    fun validateCredentials(email: String, password: String): Boolean {
        return ValidationUtils.isValidEmail(email) && ValidationUtils.hashPasswordToSHA512(password) == "0416a26ba554334286b1954918ecad7ba6c33575b49df915ff3367b5cef7ecd93b1f0b436636667b27b363011543971f1c81c3151d5ef72733501c1ff33c34af"
    }
}