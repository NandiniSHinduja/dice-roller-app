package com.example.diceroller

import android.view.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

var text1: TextView? = null
var button1: Button? = null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1 = findViewById<View>(R.id.button1) as Button
        button1!!.setOnClickListener {
            rolldice()
        }


    }



     fun rolldice(){
         text1 = findViewById<View>(R.id.text1) as TextView
         val randomInt = Random().nextInt(6) + 1
         text1!!.text = randomInt.toString()

    }


}