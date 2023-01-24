package com.example.play

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class SignInActivity : AppCompatActivity() {
    lateinit var login:CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        login=findViewById(R.id.login)
        login.setOnClickListener{
            startActivity(Intent(applicationContext,MainActivity::class.java))
        }
    }
}