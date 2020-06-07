package com.example.kazumajikku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Page7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page7)

        val numbertext = findViewById<EditText>(R.id.editText)
        val donebtn = findViewById<Button>(R.id.done)

        donebtn.setOnClickListener {
            val input = numbertext.text.toString().trim()

            if (input.isEmpty()) {
                Toast.makeText(this, "Input required", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (input.length > 3 || input.length <3) {
                Toast.makeText(this, "A 3 digit number is expected", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            var num = numbertext.text.toString()
            val intent = Intent(this,Page8::class.java)
            intent.putExtra("Number",num)
            startActivity(intent)
        }
    }
}


