package com.example.assignment1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnCall=findViewById<Button>(R.id.button2)
        val card1=findViewById<CardView>(R.id.CardView2)
        val card2=findViewById<CardView>(R.id.CardView3)
        val card3=findViewById<CardView>(R.id.CardView4)

        btnCall.setOnClickListener {
            val intent= Intent(Intent.ACTION_DIAL)
            intent.data=Uri.parse("tel:+9187634567865")
            startActivity(intent)
        }
        card1.setOnClickListener {
            intent=Intent(applicationContext,MainActivity3::class.java)
            startActivity(intent)
        }
        card2.setOnClickListener {
            intent=Intent(applicationContext,MainActivity4::class.java)
            startActivity(intent)
        }
        card3.setOnClickListener {
            intent=Intent(applicationContext,MainActivity5::class.java)
            startActivity(intent)
        }

    }
}