package com.example.kazumajikku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_page1.*

class Page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)
        findViewById<Button>(R.id.next_2).setOnClickListener {
            hide_and_show(it)
        }
    }
    private fun hide_and_show(view: View) {

        val Text2_1 = findViewById<TextView>(R.id.textView2_1)
        val Text2_2 = findViewById<TextView>(R.id.textView2_2)
        Text2_1.visibility = View.GONE
        Text2_2.visibility = View.VISIBLE
        view.setOnClickListener {
            val intent = Intent(this,Page3::class.java)
            startActivity(intent)
        }

    }
}