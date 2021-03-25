package com.tech.buttontest

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity


class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        supportActionBar?.hide()
        Handler().postDelayed({

            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()

        }, 2500)
    }
}