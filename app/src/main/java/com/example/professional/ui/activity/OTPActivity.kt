package com.example.professional.ui.activity

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.professional.R
import com.example.professional.databinding.SignupBinding
import com.example.professional.databinding.VerificationBinding
import com.example.professional.ui.viewmodel.OTPViewModel
import com.example.professional.ui.viewmodel.SignUpViewModel

class OTPActivity : AppCompatActivity() {
    private lateinit var resendCode: TextView
    private var countDownTimer: CountDownTimer? = null

    private lateinit var binding: VerificationBinding
    private val viewModel : OTPViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = VerificationBinding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.resendCode.setOnClickListener {
            if (resendCode.text.toString().contains("снова")) {
                startTimer()
            }
        }
    }

    private fun startTimer() {
        resendCode.isEnabled = false
        countDownTimer?.cancel()

        countDownTimer = object : CountDownTimer(30000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                resendCode.text = "Отправить заново (${millisUntilFinished / 1000})"
            }

            override fun onFinish() {
                resendCode.text = "Отправить снова"
                resendCode.isEnabled = true
            }
        }.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        countDownTimer?.cancel()
    }
}