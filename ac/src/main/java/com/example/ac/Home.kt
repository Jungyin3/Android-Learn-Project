package com.example.ac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Home : AppCompatActivity() {
    private lateinit var tv_receive: TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        tv_receive = findViewById(R.id.tv_receive)
//        获取传入的Intent实例以及其内部数据
        val bundle = intent.extras
        val key1 = bundle?.getString("key1")
        val key2 = bundle?.getString("key2")
        tv_receive.text = key1 + key2
    }
}