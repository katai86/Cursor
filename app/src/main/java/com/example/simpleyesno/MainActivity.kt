package com.example.simpleyesno

import android.app.Activity
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resultText = findViewById<TextView>(R.id.resultText)
        val yesButton = findViewById<Button>(R.id.yesButton)
        val noButton = findViewById<Button>(R.id.noButton)
        val exitButton = findViewById<Button>(R.id.exitButton)

        yesButton.setOnClickListener {
            resultText.text = getString(R.string.yes_label)
        }

        noButton.setOnClickListener {
            resultText.text = getString(R.string.no_label)
        }

        exitButton.setOnClickListener {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                finishAndRemoveTask()
            } else {
                finish()
            }
        }
    }
}
