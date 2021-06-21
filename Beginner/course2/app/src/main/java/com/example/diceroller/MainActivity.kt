package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        val resultText: TextView = findViewById(R.id.result_text)

        rollButton.setOnClickListener {
            val randomInt = (1..6).random()
            resultText.text = randomInt.toString()
        }

        val countUp: Button = findViewById(R.id.count_up)
        countUp.setOnClickListener {
            val text = resultText.text.toString()
            if(text.equals("Hello World!"))
            {
                resultText.text = "1"
            }
            else if(text >= "1" && text <="5")
            {
                val num = text.toInt() + 1
                resultText.text = num.toString()
            }

        }
    }
}