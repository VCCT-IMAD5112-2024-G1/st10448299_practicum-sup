package com.example.hydrationhavest10448299

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class lastPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last_page)

        val textViewStoredData1 = findViewById<TextView>(R.id.textView3)
        val textViewStoredData2 = findViewById<TextView>(R.id.textView6)
        val textViewStoredData3 = findViewById<TextView>(R.id.textView8)
        val textViewStoredData4 = findViewById<TextView>(R.id.textView10)


        val receivedData1 = intent.getStringExtra("storedData1")
        val receivedData2 = intent.getStringExtra("storedData2")
        val receivedData3 = intent.getStringExtra("storedData3")
        val receivedData4 = intent.getStringExtra("storedData4")


        textViewStoredData1.text = receivedData1
        textViewStoredData2.text = receivedData2
        textViewStoredData3.text = receivedData3
        textViewStoredData4.text = receivedData4

        val buttonNext = findViewById<Button>(R.id.button)

        buttonNext.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}