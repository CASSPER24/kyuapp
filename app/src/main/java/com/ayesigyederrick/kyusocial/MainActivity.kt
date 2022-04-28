package com.ayesigyederrick.kyusocial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonClick = findViewById<Button>(R.id.button)
        buttonClick.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        val sign_up = findViewById<TextView>(R.id.textView4)
        sign_up.setOnClickListener {
            val i = Intent(this, Signup::class.java)
            startActivity(i)
        }
        val reset_click = findViewById<TextView>(R.id.textView6)
        reset_click.setOnClickListener {
            val reset = Intent(this, activity_reset::class.java)
            startActivity(reset)
        }

    }
}