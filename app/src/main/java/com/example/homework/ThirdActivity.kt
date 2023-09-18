package com.example.homework

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.AppCompatButton

class ThirdActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)


        val getuname = intent.extras?.getString("Username")
        val uname = findViewById<TextView>(R.id.uname)
        uname.text = "Welcome $getuname"

        val studetail = findViewById<AppCompatButton>(R.id.studetail)
        studetail.setOnClickListener {
            val lists=Intent(this,AllDetails::class.java)
            startActivity(lists)
        }
        val logout = findViewById<AppCompatButton>(R.id.logout)
        logout.setOnClickListener {
            val firstpage=Intent(this,MainActivity::class.java)
            startActivity(firstpage)
            finish()
        }
        val Profile = findViewById<AppCompatButton>(R.id.Profile)
        Profile.setOnClickListener(){
            Profile()
        }

    }
       fun Profile(){
           val inflater = LayoutInflater.from(this).inflate(R.layout.coustem_dialog, null, false)
           val getusern=intent.extras?.getString("secondname")
           val usern=inflater.findViewById<EditText>(R.id.cuname1)
           usern.setText(getusern)

           val getphone=intent.extras?.getString("secondphone")
           val phone=inflater.findViewById<EditText>(R.id.cphone)
           phone.setText( getphone)

           val getgender=intent.extras?.getString("secondgender")
           val gender=inflater.findViewById<EditText>(R.id.cgender)
           gender.setText(getgender)

            val getpassword=intent.extras?.getString("secondpass")
           val password=inflater.findViewById<EditText>(R.id.cuserp)
           password.setText( getpassword)

           val alertDialog = AlertDialog.Builder(this)
           alertDialog.setPositiveButton("yes", DialogInterface.OnClickListener { _, i ->

           })
           alertDialog.setNegativeButton("no", DialogInterface.OnClickListener { _, i ->

           })

           val create = alertDialog.create()
           create.setCanceledOnTouchOutside(false)
           create.setView(inflater)
           create.show()
       }

    }
