package com.infinity.shapefactorymeasurement.views

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.infinity.shapefactorymeasurement.R

class MeasurementListActivity : AppCompatActivity() {
    private var measurementList: java.util.ArrayList<String> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_measurement_list)
        // use arrayadapter and define an array
        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf(
            "Virat Kohli", "Rohit Sharma", "Steve Smith",
            "Kane Williamson", "Ross Taylor"
        )
        measurementList = (intent.getStringArrayListExtra("mylist") as ArrayList<String>?)!!
        // access the listView from xml file
        var mListView = findViewById<ListView>(R.id.lvMeasureList)
        arrayAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, measurementList
        )
        mListView.adapter = arrayAdapter
    }

}