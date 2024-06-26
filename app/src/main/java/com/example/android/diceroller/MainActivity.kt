package com.example.android.diceroller

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.android.diceroller.databinding.ActivityMainBinding
import com.example.android.diceroller.viewmodel.DiceViewModel

/**
 * [MainActivity] UI of the App
 */
class MainActivity : AppCompatActivity() {

    // Getting the instance of ViewModel
    private val viewModel: DiceViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.viewModel = viewModel

        // Attaching the life cycle owner to update live data in xml file
        binding.lifecycleOwner = this
    }
}
