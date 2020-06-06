package com.example.diceroller

import android.annotation.SuppressLint
import android.os.Bundle

import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.randomnumber.R

class MainActivity : AppCompatActivity() {
    private lateinit var diceImage : ImageView
    private lateinit var resultText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.diceImage = findViewById(R.id.dice_image)
        this.resultText =findViewById(R.id.result_text)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }




    }

    @SuppressLint("SetTextI18n")
    private fun rollDice() {
        val randomInt = (1..6).random()

        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "The number is ${randomInt.toString()}"
        val diceImage : ImageView = findViewById(R.id.dice_image)
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5

            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }


}


