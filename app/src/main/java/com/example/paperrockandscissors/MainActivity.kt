package com.example.paperrockandscissors

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var pedra = findViewById<ImageView>(R.id.imageView5)
        var papel = findViewById<ImageView>(R.id.imageView6)
        var tesoura = findViewById<ImageView>(R.id.imageView7)

        pedra.setOnClickListener{
            appSelecionou(1)
        }
        papel.setOnClickListener{
            appSelecionou(2)
        }
        tesoura.setOnClickListener{
            appSelecionou(3)
        }

    }
    fun appSelecionou(jogadorSelecionou : Int){

        var jogadas = listOf<String>("Pedra", "Papel", "Tesoura")
        var resposta = findViewById<ImageView>(R.id.imageView)
        var respostaText = findViewById<TextView>(R.id.textView2)
        var jogada = jogadas.random()

        if (jogada== "Pedra"){
            resposta.setImageResource(R.drawable.pedra)
            if (jogadorSelecionou == 1){
                respostaText.text = "Empate ;)"
            } else if (jogadorSelecionou == 2){
                respostaText.text = "Você ganhou :)"
            } else{
                respostaText.text = "Você perdeu :("
            }
        } else if (jogada == "Papel"){
            resposta.setImageResource(R.drawable.papel)
            if (jogadorSelecionou == 2){
                respostaText.text = "Empate ;)"
            } else if (jogadorSelecionou == 3){
                respostaText.text = "Você ganhou :)"
            } else{
                respostaText.text = "Você perdeu :("
            }
        } else {
            resposta.setImageResource(R.drawable.tesoura)
            if (jogadorSelecionou == 3){
                respostaText.text = "Empate ;)"
            } else if (jogadorSelecionou == 1){
                respostaText.text = "Você ganhou :)"
            } else{
                respostaText.text = "Você perdeu :("
            }
        }
    }

}