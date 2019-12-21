package com.example.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_calculate.*

class calculateActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate)
    }

    fun addAB(view: View) {
        //get value from EditText
        var inputA = editText5.text.toString().toDouble()
        var inputB = editText6.text.toString().toDouble()
        var result = inputA.plus(inputB)
        //setText by result Value
        textView7.text = result.toString()
    }


    fun subtractAB(view: View) {
        //get value from EditText
        var inputA = editText5.text.toString().toDouble()
        var inputB = editText6.text.toString().toDouble()
        var result = inputA.minus(inputB)
        textView7.text = result.toString()
    }


    fun multiplyAB(view: View) {
        //get value from EditText
        var inputA = editText5.text.toString().toDouble()
        var inputB = editText6.text.toString().toDouble()
        var result = inputA.times(inputB)
        textView7.text = result.toString()
    }


    fun divideAB(view: View) {
        //get value from EditText
        var inputA = editText5.text.toString().toDouble()
        var inputB = editText6.text.toString().toDouble()
        var result = inputA.div(inputB)
        textView7.text = result.toString()
    }

    //Back to main page
    fun backpage(view: View) {
        // End process in this Activity and back to main page
        finish()
    }

}

