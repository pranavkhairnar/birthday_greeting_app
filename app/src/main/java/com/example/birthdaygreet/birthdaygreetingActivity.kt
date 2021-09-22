package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class birthdaygreetingActivity : AppCompatActivity() {

    companion object {
        const val NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthdaygreeting)

        val name = intent.getStringExtra(NAME_EXTRA)
        val birthdaygreetingID: TextView = findViewById(R.id.birthdaygreeting)  // fetching ID from XML file
        birthdaygreetingID.text = "happy birthday\n$name!"

    }
}