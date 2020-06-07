package com.example.kazumajikku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Page8 : AppCompatActivity() {

    lateinit var diceImage1: ImageView
    lateinit var diceImage2: ImageView
    lateinit var diceImage3: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page8)
        diceImage1 = findViewById(R.id.res1)
        diceImage2 = findViewById(R.id.res2)
        diceImage3 = findViewById(R.id.res3)

        var intent = intent
        val n = intent.getStringExtra("Number")
        val num = n.toString()
        var Inp = num.toInt()
        Inp -= 350
        var c = Inp%10
        Inp /= 10
        var b = Inp%10
        Inp /= 10
        var a = Inp
        Set_image(a,b,c)
    }

    fun Set_image(a:Int,b:Int,c:Int){
        val drawableResource1 = when (a) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6
        }

        val drawableResource2 = when (b) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6
        }

        val drawableResource3 = when (c) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6
        }
        diceImage1.setImageResource(drawableResource1)
        diceImage2.setImageResource(drawableResource2)
        diceImage3.setImageResource(drawableResource3)
    }
}
