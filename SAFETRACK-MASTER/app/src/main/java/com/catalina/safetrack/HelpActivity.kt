package com.catalina.safetrack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_help.*

class HelpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)

        title = "Ayuda"

        backButton.setOnClickListener {

            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
    }

}