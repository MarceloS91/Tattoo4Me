package com.example.tattoo2me

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class tela_intro1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_intro1)
        supportActionBar!!.hide();

        val txtbtn = findViewById<TextView>(R.id.textView11)

        txtbtn.setOnClickListener{
            tela_intro()
        }
    }

    fun tela_intro(){
        val tela_intro = Intent(this, tela_cadastro::class.java)
        startActivity(tela_intro)

    }
}