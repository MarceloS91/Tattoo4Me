package com.example.tattoo2me

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.tattoo2me.databinding.ActivityCadastroClienteBinding
import com.example.tattoo2me.databinding.ActivityTelaCadastroBinding

class tela_cadastro : AppCompatActivity() {

    private lateinit var binding: ActivityTelaCadastroBinding

    @SuppressWarnings("WrongViewCast", "MissingInflateId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_cadastro)
        supportActionBar!!.hide();

binding = ActivityTelaCadastroBinding.inflate(layoutInflater)
        val view =binding.root
        setContentView(view)

        binding.button3.setOnClickListener{
            irParacadastro_cliente()
        }
        binding.button4.setOnClickListener{
            irParacadastro_tatuador()
        }
        binding.imageView7.setOnClickListener{
            irParatela_2()
        }

    }

    fun irParacadastro_cliente(){
        val  cadastro_cliente = Intent(this, cadastro_cliente::class.java)
        startActivity(cadastro_cliente)
    }
    fun irParacadastro_tatuador() {
        val cadastro_tatuador = Intent(this, cadastro_tatuador::class.java)
        startActivity(cadastro_tatuador)
    }
        fun irParatela_2(){
            val tela_2 = Intent(this, tela_2::class.java)
            startActivity(tela_2)
        }
    }
