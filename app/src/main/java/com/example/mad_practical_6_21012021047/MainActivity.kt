package com.example.mad_practical_6_21012021047

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var play_pause:Button = findViewById(R.id.play_pause_button);

        var stop_Button:Button = findViewById(R.id.stop_button);

        play_pause.setOnClickListener {
            playpause();
        }

        stop_Button.setOnClickListener {
            stop();
        }

    }

    fun playpause() {
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PLAYERVALUE).apply {
            startService(this)
        }
    }

    fun stop() {
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PLAYERVALUE).apply {
            startService(this)
        }
    }
}