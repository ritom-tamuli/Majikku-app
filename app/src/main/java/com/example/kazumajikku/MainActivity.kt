package com.example.kazumajikku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        welcome_text.setOnClickListener {
            val intent = Intent(this,Page1::class.java)
            startActivity(intent)
        }
        textView.setOnClickListener {
            val intent = Intent(this,Page1::class.java)
            startActivity(intent)
        }
    }
}