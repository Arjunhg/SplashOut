package com.example.splashscreen
// Will also see how to remove action bar
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide() //If action bar is not present it will crash if we don't put ? mark
        Handler().postDelayed({
            val intent = Intent(this, Second::class.java)
            startActivity(intent)
            finish()
        }, 2000 ) //After , we put second parameter
    }
}