package com.example.kazumajikku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_page3.*

class Page4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page4)
        findViewById<Button>(R.id.next_4).setOnClickListener {
            hide_and_show(it)
        }
    }

    private fun hide_and_show(view: View) {

        val Text4_1 = findViewById<TextView>(R.id.textView4_1)
        val Text4_2 = findViewById<TextView>(R.id.textView4_2)
        Text4_1.visibility = View.GONE
        Text4_2.visibility = View.VISIBLE
        view.setOnClickListener {
            val intent = Intent(this, Page5::class.java)
            startActivity(intent)
        }
    }
}