package com.example.aboutmeapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import com.example.aboutmeapp.databinding.ActivityMainBinding

//You were supposed to build the UI of this app using the layout editor
//I did it  writing the xml because idk
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val myName: MyName = MyName("Bienvenido!")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.myName= myName

        binding.doneButton.setOnClickListener(){
            displayName(binding.doneButton) }
    }

    private fun displayName(view: View) {
        binding.apply{
        myName?.nickname = nameEt.text.toString()
        invalidateAll()
        nameEt.visibility= View.GONE
        view.visibility = View.GONE
        nameText.visibility = View.VISIBLE}
        //This closes the keyboard.
        //It should probably be a function
        val imm = view.context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}