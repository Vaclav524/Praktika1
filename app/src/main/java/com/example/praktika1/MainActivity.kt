package com.example.praktika1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
val button: Button =findViewById(R.id.jump)

button.setOnClickListener {
intent= Intent(this,SecondActivity2::class.java)
startActivity(intent)
}

   }
}