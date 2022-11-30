package com.example.tattoo2me

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts

class tela_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)
        supportActionBar!!.hide();

        val textbtn = findViewById<TextView>(R.id.textView9)

        textbtn.setOnClickListener{
        tela_intro1()
        }

    }
    fun tela_intro1(){
        val tela_intro1 = Intent(this, tela_intro1::class.java)
        startActivity(tela_intro1)


    }
}