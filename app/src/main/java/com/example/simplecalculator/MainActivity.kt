package com.example.simplecalculator

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.simplecalculator.databinding.ConstraintlayoutBinding



class MainActivity : ComponentActivity() {
    private lateinit var binding: ConstraintlayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ConstraintlayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.register.setOnClickListener{register()}
    }
    private fun register(){
        val firstName = binding.firstNameIn.text.toString()
        val lastName = binding.lastNameIn.text.toString()
        val gender = binding.radioGroup.checkedRadioButtonId
        val birthDay = binding.birthDayIn.text.toString()
        val email = binding.emailIn.text.toString()
        val address = binding.addressIn.text.toString()
        val checkBox = binding.checkBox.isChecked
        if (
            firstName.isEmpty() || lastName.isEmpty() ||
            (gender == -1) || birthDay.isEmpty() ||
            email.isEmpty() || address.isEmpty() ||
            !checkBox
        ){
            Toast.makeText(applicationContext, "missing content", Toast.LENGTH_LONG).show()
        }

    }
}