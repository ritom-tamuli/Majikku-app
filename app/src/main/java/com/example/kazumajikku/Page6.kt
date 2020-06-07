package com.example.kazumajikku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_page6.*

class Page6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page6)
        next_6.setOnClickListener {
            val intent = Intent(this,Page7::class.java)
            startActivity(intent)
        }
    }
}