package com.example.pdm_pratica_1

import kotlin.random.Random

class Megasena {
    private var lista: MutableSet<Int>

    init {
        this.lista = mutableSetOf()
        this.setNumeros()
    }

    fun setNumeros(){
        while(this.lista.size < 6){
            this.lista.add( Random.nextInt(from = 1, until = 61) )
        }
    }

    override fun toString(): String{
        return this.lista.toString();
    }
}