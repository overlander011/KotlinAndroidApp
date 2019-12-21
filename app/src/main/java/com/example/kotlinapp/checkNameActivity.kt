package com.example.kotlinapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_check_name.*

class checkNameActivity : AppCompatActivity() {
    // request code use for check value come from where activity
    final val taskNameReq_Code = 100

    val items = ArrayList<String>()
    // declear adapter as Null type ?
    var adapter: ArrayAdapter<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_name)

        adapter = ArrayAdapter<String> (this,
        android.R.layout.simple_list_item_1,items)

        list_item.adapter = adapter
    }

    // callback  from startActivityForResult for check req code
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        //check req code
        if(requestCode == taskNameReq_Code){
            //check result code
            if(resultCode== Activity.RESULT_OK){
                if(data!= null){
                    val inputName = data.getStringExtra("Input_name_key")
                    if(inputName!=null){
                        //add input name into list
                        items.add(inputName)
                        //notifly list what is data change
                        adapter?.notifyDataSetChanged()
                    }
                }
            }
        }
    }

    fun newButton(view: View) {
        val intent = Intent(this,saveActivity::class.java)
        //create intend for return result to hsi activity
        startActivityForResult(intent,taskNameReq_Code)

    }

}
