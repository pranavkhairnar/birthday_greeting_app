package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun createBirthdayCard(view: View) {
        /*
        val name:TextView = findViewById(R.id.nameInput)  // fetching ID from XML file
        val name1 = name.editableText.toString()
        Toast.makeText(this, "name is $name1", Toast.LENGTH_LONG).show()
        */
        val nameID:TextView = findViewById(R.id.nameInput)  // fetching ID from XML file
        val name = nameID.editableText.toString()

        val intent = Intent(this, birthdaygreetingActivity::class.java)
        intent.putExtra(birthdaygreetingActivity.NAME_EXTRA, name)
        startActivity(intent)
    }
}

