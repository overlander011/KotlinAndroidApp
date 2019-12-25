package com.example.kotlinapp

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_http_req.*
import org.json.JSONArray
import java.net.URL
import javax.net.ssl.HttpsURLConnection

class httpReqActivity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_http_req)

    }

    fun getName(view: View) {
        val url = "https://mysafeinfo.com/api/data?list=presidents&format=json"

        AsyncTaskHandleJson().execute(url)
    }

    inner class AsyncTaskHandleJson :AsyncTask<String, String, String>() {
        override fun doInBackground(vararg url: String?): String {

            var text: String
            val connection = URL(url[0]).openConnection() as HttpsURLConnection
            try{
                connection.connect()
                text = connection.inputStream.use {it.reader().use{reader -> reader.readText() } }
            }finally {
                connection.disconnect()
            }
            return  text
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            handleJson(result)
        }

    }

    private fun handleJson(jsonString: String?) {

        val jsonArray = JSONArray(jsonString)

        val list = ArrayList<dataName>()
        var x = 0
        while (x <jsonArray.length()){
            val jsonObject = jsonArray.getJSONObject(x)
            list.add(
                dataName(
                    jsonObject.getInt("ID"),
                    jsonObject.getString("FullName"),
                    jsonObject.getString("Party"),
                    jsonObject.getString("Terms")
                ))
            x++
        }
        val adapter = ListAdapte(this,list)
        name_list.adapter = adapter
    }


    fun backpage(view: View) {
        finish()
    }
}
