package com.odukabdulbasit.simplelistview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var listView: ListView
    private val items = arrayOf("Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6", "Item 7", "Item 8", "Item 9", "Item 10")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)

        // Create an ArrayAdapter to display the items
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,  // Built-in layout for simple item display
            items  // The array of items to display
        )

        // Set the ArrayAdapter on the ListView
        listView.adapter = adapter
    }
}