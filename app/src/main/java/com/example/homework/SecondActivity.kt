package com.example.homework

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class SecondActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val regbtn = findViewById<AppCompatButton>(R.id.Regbtn)
        regbtn.setOnClickListener(){
            alldetails()
        }


    }
        @SuppressLint("SuspiciousIndentation")
        fun alldetails(){

        val usern=findViewById<EditText>(R.id.uname1)
        val phone=findViewById<EditText>(R.id.phone)
        val gender=findViewById<EditText>(R.id.gender)
        val password=findViewById<EditText>(R.id.userp)

            if(usern.text.isEmpty()){
                Toast.makeText(this, "please enter username", Toast.LENGTH_SHORT).show()
            }
            else if(phone.text.isEmpty()){
                Toast.makeText(this, "please Enter phone number", Toast.LENGTH_SHORT).show()
            }
            else if(gender.text.isEmpty()){
                Toast.makeText(this, "please Enter gender", Toast.LENGTH_SHORT).show()
            }
            else if(password.text.isEmpty()){
                Toast.makeText(this, "please Enter password", Toast.LENGTH_SHORT).show()
            }
            else {
                val third = Intent(this, ThirdActivity::class.java)
                third.putExtra("secondname",usern.text.toString())
                third.putExtra("secondphone",phone.text.toString())
                third.putExtra("secondgender",gender.text.toString())
                third.putExtra("secondpass",password.text.toString())
                startActivity(third)
                finish()
            }
                }

           }