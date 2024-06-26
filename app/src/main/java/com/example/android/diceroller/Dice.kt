package com.example.android.diceroller


class Dice(private val sides: Int) {
    fun roll() = (1..sides).random()
}