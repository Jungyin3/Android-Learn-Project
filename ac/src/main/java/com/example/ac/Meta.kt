package com.example.ac

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Meta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meta)

//        提取元数据
        val pm = packageManager;
        try {
            val info = pm.getActivityInfo(componentName, PackageManager.GET_META_DATA)
            val bundle = info.metaData
            val weather = bundle.getString("weather")

            findViewById<TextView>(R.id.tv_meta).text = weather
        } finally {

        }
    }
}