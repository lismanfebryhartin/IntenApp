package com.lismanfh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class MoveWithDataActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_NAMA = "extra_nama"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)

        val tvDataReceived: TextView = findViewById(R.id.tv_data_received)
        val name = intent.getStringExtra(EXTRA_NAMA)
        val age = intent.getIntExtra(EXTRA_AGE, 0)
        val text = "name : $name, Your Age : $age"
        tvDataReceived.text = text
    }
}