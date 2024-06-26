package com.example.android.diceroller.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.android.diceroller.Dice

class DiceViewModel : ViewModel() {
    private var _rollResult = MutableLiveData<Int>()
    val rollResult: LiveData<Int> get() = _rollResult

    init {
        rollDice()
    }

    fun rollDice() {
        _rollResult.value = Dice(6).roll()
    }
}