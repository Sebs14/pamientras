package com.mhernandez.appproject_veterinaria4patas

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LogIn: AppCompatActivity() {

    private lateinit var btnLog:Button
    private lateinit var btnSign:Button

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.in_log)
        binding()
        btnSign.setOnClickListener{
         signIn()
        }
        btnLog.setOnClickListener{
            logIn()
        }
    }

    private fun binding(){
        btnLog = findViewById(R.id.sesion)
        btnSign = findViewById(R.id.register)
    }

    private fun signIn(){
        val intent = Intent(this,SignIn::class.java)
        startActivity(intent)
    }

    private fun logIn(){
    val intent = Intent(this, ClientHome::class.java)
    startActivity(intent)

    }
}