package com.example.kazumajikku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_page5.*

class Page5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page5)
        next_5.setOnClickListener {
            val intent = Intent(this,Page6::class.java)
            startActivity(intent)
        }
    }
}