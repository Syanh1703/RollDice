package com.example.rolldice

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollBtn : Button = findViewById(R.id.rollBtn)
        rollBtn.setOnClickListener {
            rollDice()
        }
    }
    private fun rollDice()
    {
        val dice = Dice(6)
        val dice2 = Dice(6)
        val toRoll = dice.roll()
        val toRoll2 = dice2.roll()
        val toast = Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT).show()
        val resultTextView :TextView = findViewById(R.id.displayTextView)
        val displayView :TextView = findViewById(R.id.display2)
        resultTextView.text = toRoll.toString()
        displayView.text = toRoll2.toString()
    }
}

//Create a class for the dice
class Dice (private val numSide :Int)
{
    fun roll():Int
    {
        return (1..6).random()
    }
}

