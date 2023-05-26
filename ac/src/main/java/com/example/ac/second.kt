package com.example.ac

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        findViewById<Button>(R.id.btn_back).setOnClickListener {
//            结束当前活动页面
//            finish()
//            创建1个意图对象
            val intent = Intent(this, first::class.java)
//            栈中存在待跳转的实例对象，则重新创建当前实例对象，并清楚原栈中的对象
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }
    }
}