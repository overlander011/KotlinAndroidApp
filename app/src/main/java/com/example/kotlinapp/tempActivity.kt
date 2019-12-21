package com.example.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_calculate.*
import kotlinx.android.synthetic.main.activity_temp.*

class tempActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temp)
    }

    fun converseCtoF(view: View) {
        var Celsious = editText2.text.toString().toDouble()
        var fahrenhiet = (Celsious*1.8)+32
        textView13.text = fahrenhiet.toString()

    }

    fun backpage(view: View) {
        // End process in this Activity and back to main page
        finish()
    }
}
