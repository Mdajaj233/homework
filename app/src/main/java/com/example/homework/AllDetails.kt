package com.example.homework

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialog

class AllDetails : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_details)

        val btun = findViewById<Button>(R.id.Btun)
                btun.setOnClickListener(){
            buttonsit()
        }
    }
        fun buttonsit(){
        var arr = arrayListOf("ejaj", "suraj", "shohail", "Ajit")
        var Adapter = ArrayAdapter(this, R.layout.list_layout, arr)
        val listview = findViewById<ListView>(R.id.listview)
        listview.adapter = Adapter



    }

//        @SuppressLint("MissingInflatedId")
//        fun buttonsit() {
//         val btnseet=BottomSheetDialog(this)
//            val row=LayoutInflater.from(this).inflate(R.layout.list_layout,null,false)
//            val rowl=row.findViewById<ListView>(R.id.listview)
//            var arr = arrayListOf("ejaj", "suraj", "shohail", "Ajit")
//            var Adapter = ArrayAdapter(this, R.layout.list_layout, arr)
//            rowl.adapter=Adapter
//
//            btnseet.setContentView(row)
//            btnseet.show()
//
//
//
//    }
}