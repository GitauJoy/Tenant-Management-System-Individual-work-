package com.example.tenantmanagementsystem

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.tenantmanagementsystem.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Use DataBindingUtil instead of ActivityMainBinding.inflate
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.saveButton.setOnClickListener {
            val name = binding.tenantNameEditText.text.toString()
            val phone = binding.phoneEditText.text.toString()
            val rent = binding.rentEditText.text.toString()

            val tenant = Tenant(name, phone, rent)
            binding.tenant = tenant
        }
    }
}