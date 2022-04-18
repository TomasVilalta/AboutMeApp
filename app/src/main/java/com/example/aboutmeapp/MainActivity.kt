package com.example.aboutmeapp

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

//You were supposed to build the UI of this app using the layout editor
//I did it  writing the xml because idk
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.done_button)


        button.setOnClickListener(){
            displayName(button)

        }


    }


    private fun displayName(view: View) {
        val editText  = findViewById<EditText>(R.id.name_et)
        val name = findViewById<TextView>(R.id.name_text)
        name.text = editText.text
        editText.visibility= View.GONE
        view.visibility = View.GONE
        name.visibility = View.VISIBLE

        //This closes the keyboard.
        //It should probably be a function
        val imm = view.context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}