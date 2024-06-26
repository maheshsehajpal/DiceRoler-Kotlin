package com.example.android.diceroller

import android.widget.ImageView
import androidx.databinding.BindingAdapter

@BindingAdapter("rollResult")
fun ImageView.bindImage(rollResult: Int) {
    val imageResource: Int = when (rollResult) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }
    this.setImageResource(imageResource)
}