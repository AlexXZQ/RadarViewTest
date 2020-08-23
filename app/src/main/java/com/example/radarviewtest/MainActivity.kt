package com.example.radarviewtest

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var radar_view: RadarView

    lateinit var btn_start: Button

    lateinit var btn_stop: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radar_view = findViewById(R.id.radar_view)
        btn_start = findViewById(R.id.btn_start)
        btn_stop = findViewById(R.id.btn_stop)

        radar_view.setBorderColor(Color.TRANSPARENT)
        radar_view.setBorderWidth(5F)
        radar_view.setBitmapEnabled(true, resources.getDrawable(R.mipmap.ic_launcher_round))

        btn_start.setOnClickListener {
            radar_view.start()
        }

        btn_stop.setOnClickListener {
            radar_view.stop()
            radar_view.addTarget(7)
        }
    }
}