package com.example.empty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nameText = findViewById<EditText>(R.id.tv_name)
        val heightText = findViewById<EditText>(R.id.tv_height)
        val weightText = findViewById<EditText>(R.id.tv_weight)
        val ageText = findViewById<EditText>(R.id.tv_age)
        val button = findViewById<Button>(R.id.b_validation)
        val resultText = findViewById<TextView>(R.id.tv_result)
        button.setOnClickListener {
            var result = ""
            if (heightText.text.toString() != "" && weightText.text.toString() != "" && ageText.text.toString() != ""
                && isCorrectInput(nameText.length(), heightText.text.toString().toInt(), weightText.text.toString().toDouble(), ageText.text.toString().toInt()))
                result = "Ответ: " + (nameText.length() +
                        heightText.text.toString().toInt() +
                        weightText.text.toString().toDouble() +
                        ageText.text.toString().toInt()).toString()
            else result = "Данные введены некорректно."
            resultText.text = "$result"
        }
    }
    fun isCorrectInput(name_length: Int, height: Int, weight: Double, age: Int) : Boolean {
        return name_length <= 50 && name_length > 0 &&
                height < 250 && height > 0 &&
                weight < 250 && weight > 0 &&
                age < 150 && age > 0
    }
}