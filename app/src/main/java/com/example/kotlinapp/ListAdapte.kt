package com.example.kotlinapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.appcompat.widget.AppCompatTextView

class ListAdapte(val context: Context, val list :ArrayList<dataName>) :BaseAdapter () {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view: View = LayoutInflater.from(context).inflate(R.layout.row_layout,parent,false)

        val nameID = view.findViewById(R.id.name_id) as AppCompatTextView
        val name = view.findViewById(R.id.name) as AppCompatTextView
        val namePolitics = view.findViewById(R.id.name_politics) as AppCompatTextView
        val nameTime = view.findViewById(R.id.name_time) as AppCompatTextView

        nameID.text = list[position].id.toString()
        name.text = list[position].name
        namePolitics.text = list[position].politic
        nameTime.text = list[position].time

        return view

    }

    override fun getItem(position: Int): Any {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return  list.size
    }

}