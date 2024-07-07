package com.example.loopwearmobileapp

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loopwearmobileapp.databinding.ActivityLoginBinding

class Login:AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    binding = ActivityLoginBinding.inflate(layoutInflater)
    setContentView(binding.root)
    binding.tvButton2.setOnClickListener {
        startActivity(Intent(this, MainActivity::class.java))
    }
    binding.tvButton2.setOnClickListener { validateLogin() }

}
fun validateLogin() {
    var formError = false
    clearErrors()
    val userName = binding.etEmail.text.toString()
    if (userName.isBlank()) {
        formError = true
        binding.etEmail.error = "user name is required"
    }
    val password = binding.etPassword.text.toString()
    if (password.isBlank()) {
        formError = true
        binding.telPassword.error = "password is required"
    }

}

fun clearErrors() {
    binding.etPassword.error = null
    binding.telPassword.error = null

}
}