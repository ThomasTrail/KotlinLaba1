package com.example.laba1

import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class AverageCalculator: AppCompatActivity(){
    companion object {

        fun generateRandom(): List<Int> {
            val randomNumbers = mutableListOf<Int>()
            val random = Random.Default

            repeat(10) {
                val randomNumber = random.nextInt(1,11) // Генерируем случайное целое число
                randomNumbers.add(randomNumber) // Добавляем число в список
            }

            return randomNumbers
        }
        fun calculateAverage(input: List<Int>): Double {
            val oddIndexNumbers = input.filterIndexed { index, _ -> index % 2 != 0 }
            val evenNumbers = oddIndexNumbers.filter { it % 2 == 0 }

            return if (evenNumbers.isEmpty()) {
                0.0
            } else {
                evenNumbers.average()
            }
        }
    }
}