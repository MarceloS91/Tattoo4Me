package com.example.tattoo2me

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class tela_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela1)
        supportActionBar!!.hide();
        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener{
        telalogin()
        }


    }

    fun telalogin(){
        val telalogin = Intent(this, tela_2::class.java)
        startActivity(telalogin)
    }
}