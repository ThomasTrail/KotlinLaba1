package com.example.laba1

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.laba1.ui.theme.Laba1Theme

class MainActivity : ComponentActivity() {
    private lateinit var inputText: EditText
    private lateinit var calculateButton: Button
    private lateinit var resultText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        System.out.println("crt")
        setContentView(R.layout.layoutlab)

        inputText = findViewById(R.id.inputText)
        calculateButton = findViewById(R.id.calculateButton)
        resultText = findViewById(R.id.resultText)

        calculateButton.setOnClickListener(View.OnClickListener {
            val input = inputText.text.toString()
            val average = Lab1Helper.calculateAverage(input)
            resultText.text = "Среднее значение четных чисел в нечетных позициях: $average"
        })
    }
    override fun onStop(){
        super.onStop()
        System.out.println("stop")
        Log.d("mmm","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        System.out.println("destr")
        Log.d("mmm","destr")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Laba1Theme {
        Greeting("Android")
    }
}