package com.example.cgpaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.cscorner.firstapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnobj = findViewById<Button>(R.id.login_1)

        btnobj.setOnClickListener {
            Toast.makeText(this, "LOGIN IS SUCCESSFULL", Toast.LENGTH_SHORT).show()
        }
    }
}
