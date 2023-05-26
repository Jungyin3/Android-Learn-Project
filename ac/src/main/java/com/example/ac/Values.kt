package com.example.ac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Values : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_values)

//        从values里面读取strings.xml读取配置信息
        val weather = getString(R.string.weather_str)
        findViewById<TextView>(R.id.tv_v).text = weather
    }
}