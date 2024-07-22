package com.example.hydrationhavest10448299

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class mainscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainscreen)

        val editTextData1 = findViewById<EditText>(R.id.Date)
        val editTextData2 = findViewById<EditText>(R.id.morning_intake)
        val editTextData3 = findViewById<EditText>(R.id.afternoon_intake)
        val editTextData4 = findViewById<EditText>(R.id.hydration_notes)
        val buttonStoreData = findViewById<Button>(R.id.btn_nxt)

        buttonStoreData.setOnClickListener {
            val dataToStore1 = editTextData1.text.toString()
            val dataToStore2 = editTextData2.text.toString()
            val dataToStore3 = editTextData3.text.toString()
            val dataToStore4 = editTextData4.text.toString()

            val intent = Intent(this, lastPage::class.java)
            intent.putExtra("storedData1", dataToStore1)
            intent.putExtra("storedData2", dataToStore2)
            intent.putExtra("storedData3", dataToStore3)
            intent.putExtra("storedData4", dataToStore4)

            startActivity(intent)
        }

        val buttonNext = findViewById<Button>(R.id.btn_bck1)

        buttonNext.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}