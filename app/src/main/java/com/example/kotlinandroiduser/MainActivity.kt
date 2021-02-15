package com.example.kotlinandroiduser

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var resultView: TextView
    private lateinit var calc: Calc
    private lateinit var resultText: String
    private lateinit var firstNumber: EditText
    private lateinit var secondNumber: EditText
    private lateinit var addButton: Button
    private lateinit var subtractButton: Button
    private lateinit var multiplyButton: Button
    private lateinit var divideButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        calc = Calc()
        resultText = getString(R.string.resultText)
        firstNumber = findViewById(R.id.firstNumber)
        secondNumber = findViewById(R.id.secondNumber)
        resultView = findViewById(R.id.resultView)

        addButton = findViewById(R.id.addButton)
        addButton.setOnClickListener {
            val first = firstNumber.text.toString().toDouble()
            val second = secondNumber.text.toString().toDouble()
            val result = calc.add(first, second).toString()
            setResult(result)
        }

        subtractButton = findViewById(R.id.subtractButton)
        subtractButton.setOnClickListener {
            val first = firstNumber.text.toString().toDouble()
            val second = secondNumber.text.toString().toDouble()
            val result = calc.subtract(first, second).toString()
            setResult(result)
        }

        multiplyButton = findViewById(R.id.multiplyButton)
        multiplyButton.setOnClickListener {
            val first = firstNumber.text.toString().toDouble()
            val second = secondNumber.text.toString().toDouble()
            val result = calc.multiply(first, second).toString()
            setResult(result)
        }

        divideButton = findViewById(R.id.divideButton)
        divideButton.setOnClickListener {
            val first = firstNumber.text.toString().toDouble()
            val second = secondNumber.text.toString().toDouble()
            val result = calc.divide(first, second).toString()
            setResult(result)
        }
    }

    private fun setResult(result: String) {
        val newResult = "$resultText $result" + "Double"
        resultView.text = newResult
    }
}