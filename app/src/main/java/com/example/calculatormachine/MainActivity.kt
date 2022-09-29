package com.example.calculatormachine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var firstNumber: EditText
    private lateinit var secondNumber: EditText
    private lateinit var plusButton: Button
    private lateinit var minusButton: Button
    private lateinit var multiplyButton: Button
    private lateinit var divideButton: Button
    private lateinit var resultS: TextView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firstNumber = findViewById(R.id.etInput1)
        secondNumber = findViewById(R.id.etInput2)
        plusButton = findViewById(R.id.plusButton)
        minusButton = findViewById(R.id.minusButton)
        multiplyButton = findViewById(R.id.multiplyButton)
        divideButton = findViewById(R.id.divideButton)
        resultS = findViewById(R.id.tvResult)

        plusButton.setOnClickListener {
            plusNumbers()
        }
        minusButton.setOnClickListener {
            minusNumbers()
        }
        divideButton.setOnClickListener {
            divideNumbers()
        }
        multiplyButton.setOnClickListener {
            multiplyNumbers()
        }

    }

    private fun plusNumbers () {
        if (firstNumber.text.toString().isNotEmpty() && secondNumber.text.toString().isNotEmpty()) {
            val firstNumber = firstNumber.text.toString().toInt()
            val secondNumber = secondNumber.text.toString().toInt()
            val result = firstNumber + secondNumber
            resultS.text = result.toString()
        }
        else {
            resultS.text = "Please enter a number"
        }

    }
    private fun minusNumbers () {
        if (firstNumber.text.toString().isNotEmpty() && secondNumber.text.toString().isNotEmpty()) {
            val firstNumber = firstNumber.text.toString().toInt()
            val secondNumber = secondNumber.text.toString().toInt()
            val result = firstNumber - secondNumber
            resultS.text = result.toString()
        }
        else {
            resultS.text = "Please enter a number"
        }
    }
    private fun divideNumbers () {
        if (firstNumber.text.toString().isNotEmpty() && secondNumber.text.toString().isNotEmpty()) {
            val firstNumber = firstNumber.text.toString().toInt()
            val secondNumber = secondNumber.text.toString().toInt()
            val result = firstNumber / secondNumber
            resultS.text = result.toString()
        }
        else {
            resultS.text = "Please enter a number"
        }
    }
    private fun multiplyNumbers () {
        if (firstNumber.text.toString().isNotEmpty() && secondNumber.text.toString().isNotEmpty()) {
            val firstNumber = firstNumber.text.toString().toInt()
            val secondNumber = secondNumber.text.toString().toInt()
            val result = firstNumber * secondNumber
            resultS.text = result.toString()
        }
        else {
            resultS.text = "Please enter a number"
        }
    }


}