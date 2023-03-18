package com.example.unitcalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * This activity allows the user to convert from ml to oz and vice versa
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputValue = findViewById<EditText>(R.id.editText)
        val outputValue = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)
        val inverse = findViewById<Switch>(R.id.inverse)

        button.setOnClickListener() {
            //conversion from ml to oz
            val ml = inputValue.text.toString().toFloat()
            val oz = ml * 0.03381402
            outputValue.text = oz.toString()

            //conversion from oz to ml
            if (inverse.isChecked) {
                val oz = inputValue.text.toString().toFloat()
                val ml = oz / 0.03381402
                outputValue.text = ml.toString()
            }
        }
    }
}
