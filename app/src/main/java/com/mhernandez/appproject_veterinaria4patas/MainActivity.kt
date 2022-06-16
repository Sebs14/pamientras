package com.mhernandez.appproject_veterinaria4patas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var buttonLog: Button
    private lateinit var buttonSign: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind()
        addListener()
    }

    private fun bind(){
        buttonLog = findViewById(R.id.button_log)
        buttonSign = findViewById(R.id.button_Sign)
    }

    private fun addListener(){
        buttonLog.setOnClickListener{
            logIn()
        }
        buttonSign.setOnClickListener{

        }
    }

    private fun logIn(){
        val intent = Intent(this, LogIn::class.java)
        startActivity(intent)
    }

    private fun signIn(){
        val intent = Intent(this, SignIn::class.java)
        startActivity(intent)
    }
}