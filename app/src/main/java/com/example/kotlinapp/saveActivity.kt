package com.example.kotlinapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_save.*

class saveActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_save)
    }

    fun backpage(view: View) {
        //return result cancel
        setResult(Activity.RESULT_CANCELED)
        finish()
    }

    fun saveButton(view: View) {
        val inputName =  inputEditText.text.toString()
        //check input name
        if (inputName !="") {
            //send data by intend
            val data = Intent()
            data.putExtra("Input_name_key",inputName)
            //return result ok
            setResult(Activity.RESULT_OK,data)
        }else{
            setResult(Activity.RESULT_CANCELED)
            }
        finish()
    }
}
