package com.example.aboutmeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//You were supposed to build the UI of this app using the layout editor
//I did it directly writing xml because idk
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}