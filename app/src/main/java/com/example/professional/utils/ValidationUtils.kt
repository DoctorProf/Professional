package com.example.professional.utils

import java.math.BigInteger
import java.security.MessageDigest

object ValidationUtils {

    fun hashPasswordToSHA512(password: String): String {
        val messageDigest = MessageDigest.getInstance("SHA-512")
        val byteHash = messageDigest.digest(password.toByteArray())
        val bigInt = BigInteger(1, byteHash)
        return bigInt.toString(16).padStart(128, '0')
    }
    fun isValidEmail(email : String) : Boolean {
        val emailPattern = "^[a-z0-9]+@[a-z0-9]+\\.[a-z]{2,}$".toRegex()
        return emailPattern.matches(email)
    }
}
