package com.example.homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn2=findViewById<AppCompatButton>(R.id.btn2)
        btn2.setOnClickListener(){
            register()
        }
        val btn1=findViewById<AppCompatButton>(R.id.btn1)
        btn1.setOnClickListener(){
            login()
        }
    }
    fun register() {
        val username = findViewById<EditText>(R.id.Username)
        val password = findViewById<EditText>(R.id.Password)
        if (username.text.isEmpty()) {
            Toast.makeText(this, "please Enter Username", Toast.LENGTH_SHORT).show()
        } else if (password.text.isEmpty()) {
            Toast.makeText(this, "Please Enter Password", Toast.LENGTH_SHORT).show()
        } else {
            val second = Intent(this, SecondActivity::class.java)
            startActivity(second)
        }
    }
        fun login(){
            val username = findViewById<EditText>(R.id.Username)
            val password = findViewById<EditText>(R.id.Password)
            if(username.text.isEmpty()){
                Toast.makeText(this, "please Enter Username", Toast.LENGTH_SHORT).show()
            }
            else if (password.text.isEmpty()){
                Toast.makeText(this, "Please Enter Password", Toast.LENGTH_SHORT).show()
            }
            else {
                val second=Intent(this,ThirdActivity::class.java)
                second.putExtra("Username",username.text.toString())
                startActivity(second)
            }
    }
}