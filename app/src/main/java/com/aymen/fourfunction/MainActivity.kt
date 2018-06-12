package com.aymen.fourfunction

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setOnClickListenerForButton()
    }

    private fun add(): Double{
        var result = num1.getText().toString().toDouble() + num2.getText().toString().toDouble()
        return result
    }

    private fun subtract(): Double{
        var result = num1.getText().toString().toDouble() - num2.getText().toString().toDouble()
        return result
    }

    private fun multiply(): Double{
        var result = num1.getText().toString().toDouble() * num2.getText().toString().toDouble()
        return result
    }

    private fun divide(): Double{
        var result = num1.getText().toString().toDouble() / num2.getText().toString().toDouble()
        return result
    }

    private fun setOnClickListenerForButton(){
        btnPlus.setOnClickListener{
            numResult.setText(add().toString())
        }

        btnMinus.setOnClickListener{
            numResult.setText(subtract().toString())
        }

        btnMulti.setOnClickListener{
            numResult.setText(multiply().toString())
        }

        btnDivide.setOnClickListener{
            numResult.setText(divide().toString())
        }

    }


}
