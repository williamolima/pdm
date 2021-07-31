package com.example.pdm_pratica_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var info: TextView
    private lateinit var desc: TextView
    private lateinit var botao: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.info = findViewById(R.id.tvInfo)
        this.desc = findViewById(R.id.tvDescricao)
        this.botao = findViewById(R.id.button)

        this.botao.setOnClickListener(TrataClickBotao())
    }

    //inserir nome da informação, que ficará no topo
    fun novaInfo(view: View){
        this.desc.text = Build().toString()
    }

    inner class TrataClickBotao: View.OnClickListener{
        override fun onClick(v:View?){
            //inserir conteúdo da classe build
            this@MainActivity.desc.text = Build().toString()
        }
    }
}