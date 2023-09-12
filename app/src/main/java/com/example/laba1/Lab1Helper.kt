package com.example.laba1

import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.tooling.preview.Preview

class Lab1Helper: AppCompatActivity(){
    companion object {
        fun calculateAverage(input: String): Double {
            val numbers = input.split(",").map { it.trim().toIntOrNull() }.filterNotNull()
            System.out.println(numbers.average())
            val oddIndexNumbers = numbers.filterIndexed { index, _ -> index % 2 != 0 }
            val evenNumbers = oddIndexNumbers.filter { it % 2 == 0 }

            return if (evenNumbers.isEmpty()) {
                0.0
            } else {
                evenNumbers.average()
            }
        }
    }
}