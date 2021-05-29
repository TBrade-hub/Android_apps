package com.android.example.studio_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    //Binding Object
    private lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpVariables()



    }

    private fun setUpVariables(){
        button = findViewById(R.id.bt_home)
        button.setOnClickListener{
            changeToHomeActivity()
        }
    }


    private fun changeToHomeActivity(){
        val intent = Intent(this, Home_Main::class.java)
        startActivity(intent)
    }
}




