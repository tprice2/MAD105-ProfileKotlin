package com.example.android.profilekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnProfile = findViewById<Button>(R.id.idBtnViewProfile)
        btnProfile.setOnClickListener {

            var intent = Intent(this,Main2Activity::class.java)
            startActivity(intent)
        }
    }
}
