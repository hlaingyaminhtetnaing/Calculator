package com.hlaingyaminhtetnaing.mycalculatorviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.hlaingyaminhtetnaing.mycalculatorviewmodel.viewmodel.calculatorViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var resultViewModel=ViewModelProvider(this).get(calculatorViewModel::class.java)
        EditTextfirstNumber.setText("")
        EditTextsecondNumber.setText("")
        BtnAdd.setOnClickListener {
            var numOne=EditTextfirstNumber.text.toString().toInt()
            var numTwo=EditTextsecondNumber.text.toString().toInt()
            txtResult.text=resultViewModel.add(numOne,numTwo).toString()
        }
        BtnSub.setOnClickListener {
            var numOne=EditTextfirstNumber.text.toString().toInt()
            var numTwo=EditTextsecondNumber.text.toString().toInt()
            txtResult.text=resultViewModel.sub(numOne,numTwo).toString()
        }
        BtnMul.setOnClickListener {
            var numOne=EditTextfirstNumber.text.toString().toInt()
            var numTwo=EditTextsecondNumber.text.toString().toInt()
            txtResult.text=resultViewModel.multiply(numOne,numTwo).toString()
        }
        BtnDiv.setOnClickListener {
            var numOne=EditTextfirstNumber.text.toString().toInt()
            var numTwo=EditTextsecondNumber.text.toString().toInt()
            txtResult.text=resultViewModel.Division(numOne,numTwo).toString()
        }


    }
}