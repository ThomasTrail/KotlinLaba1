package com.example.laba1

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    private lateinit var inputText: EditText
    private lateinit var calculateButton: Button
    private lateinit var calculateButton1: Button
    private lateinit var resultText: TextView
    private lateinit var randomText: TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layoutlab)

        inputText = findViewById(R.id.inputText)
        calculateButton = findViewById(R.id.inputCalculateButton)
        calculateButton1 = findViewById(R.id.randomCalculateButton)
        resultText = findViewById(R.id.resultText)
        randomText = findViewById(R.id.randomGenerated)
        val startTextOfResult = resultText.text
        val startRandomText = randomText.text

        calculateButton.setOnClickListener(View.OnClickListener {
            val input = inputText.text
            val numbers = input.split(",").map { it.trim().toIntOrNull() }.filterNotNull()
            val average = AverageCalculator.calculateAverage(numbers)
            resultText.text = "$startTextOfResult $average"
        })
        calculateButton1.setOnClickListener(View.OnClickListener {
            val input = AverageCalculator.generateRandom()
            //val numbers = input.joinToString { "," }
            //System.out.println(input.joinToString { "," }+""+numbers)
            randomText.text ="$startRandomText\n" + input.toString()
            val average = AverageCalculator.calculateAverage(input)
            resultText.text = "$startTextOfResult $average"
        })
    }
}