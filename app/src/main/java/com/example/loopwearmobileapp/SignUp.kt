package com.example.loopwearmobileapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loopwearmobileapp.databinding.ActivityMainBinding
import com.example.loopwearmobileapp.databinding.SignUpBinding

class SignUp : AppCompatActivity() {
    lateinit var binding: SignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=SignUpBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
//        binding.button.setOnClickListener {
//        validateRegistration()
//        }
        }



    fun validateRegistration() {
        var formError = false
        clearErrors()
        val firstName = binding.etFirstName.text.toString()
        if (firstName.isBlank()) {
            formError = true
            binding.etFirstName.error = "First name is required"
        }

        val email = binding.etEmail.text.toString()
        if (email.isBlank()) {
            formError = true
            binding.telEmail.error = "Email is required"
        }
        val password = binding.etPassword.text.toString()
        if (password.isBlank()) {
            formError = true
            binding.etPassword.error = "Password is required"
        }
        val confirmPassword = binding.etConfirmPassword.text.toString()
        if (confirmPassword.isBlank()) {
            formError = true
            binding.etConfirmPassword.error = "Confirm password is required"

        }
        if (password != confirmPassword) {
            formError = true
            binding.telConfirmPassword.error = "password is required"
        }

            val registration = Registration(
                firstname = firstName,
                email = email,
                password = password,
                confirmPassword = confirmPassword

            )

        }


        fun clearErrors() {
            binding.telFirstName.error = null
            binding.telEmail.error = null
            binding.telPassword.error = null
            binding.telConfirmPassword.error = null
        }
    }
