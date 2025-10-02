package com.example.financialdashboardapplication.Activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.financialdashboardapplication.Adapter.TransectionAdapter
import com.example.financialdashboardapplication.Model.Transection
import com.example.financialdashboardapplication.R
import com.example.financialdashboardapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list: MutableList<Transection> = mutableListOf(
            Transection("Add to Wallet", "2025-05-19 13:47", 923.2),
            Transection("Transection to Tina", "2025-05-19 11:47", -576.2),
            Transection("Buy Hamburger", "2025-05-19 12:47", -231.2)
        )
        binding.transectionView.apply {
            layoutManager = LinearLayoutManager(
                this@MainActivity,
                LinearLayoutManager.VERTICAL,
                false
            )
            adapter = TransectionAdapter(list)
        }
    }
}