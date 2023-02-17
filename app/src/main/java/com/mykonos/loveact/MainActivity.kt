package com.mykonos.loveact

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.Start)
        btn.setOnClickListener {

            val NickName = findViewById<EditText>(R.id.NickName)

            // val male = findViewById<RadioButton>(R.id.male)
            // val female = findViewById<RadioButton>(R.id.female)

            startActivity(
                Intent(this, HomeActivity::class.java).apply {
                    putExtra("NickName", NickName.text.toString())
                }
            )

        }
    }
}