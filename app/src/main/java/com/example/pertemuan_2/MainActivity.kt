package com.example.pertemuan_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.pertemuan_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var number = 0
//    ini hanya komentar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            txtNumber.text = number.toString()
            btnCount.setOnClickListener {
                number++
                txtNumber.text = number.toString()
            }
            btnToast.setOnClickListener {
                Toast.makeText(this@MainActivity, "Itu angka $number", Toast.LENGTH_SHORT).show()
            }
        }
    }
}