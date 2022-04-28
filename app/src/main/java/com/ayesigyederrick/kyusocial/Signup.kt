package com.ayesigyederrick.kyusocial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        title = "Sign Up"

        val sign_up = findViewById<Button>(R.id.button2)
        sign_up.setOnClickListener {
            val i = Intent(this, Home::class.java)
            startActivity(i)
        }
    }
}