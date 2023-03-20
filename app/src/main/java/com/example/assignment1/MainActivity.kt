package com.example.assignment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick=findViewById<Button>(R.id.button)

        btnClick.setOnClickListener {
            intent= Intent(applicationContext,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}