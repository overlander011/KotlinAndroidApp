package com.example.kotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun calculation(view: View) {
        // open calculate Activity from this Acticity
        intent = Intent(this,calculateActivity::class.java)
        startActivity(intent)
    }

    fun temperature(view: View) {
        // open tempActivity Activity from this Acticity
        intent = Intent(this,tempActivity::class.java)
        startActivity(intent)
    }

    fun checkname(view: View) {
        // open checkNameActivity Activity from this Acticity
        intent = Intent(this,checkNameActivity::class.java)
        startActivity(intent)
    }

    fun httpReq(view: View) {
        intent = Intent(this,httpReqActivity::class.java)
        startActivity(intent)
    }
}
