package com.example.shape

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Shape : AppCompatActivity() {
    private lateinit var v_v: View;
    private lateinit var btn_rect: Button;
    private lateinit var btn_oval: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shape)

        /**
         * 点击按钮设置View的形状
         * */
        v_v = findViewById(R.id.v_v)
        btn_rect = findViewById(R.id.btn_rect)
        btn_oval = findViewById(R.id.btn_ovl)

//        设置背景
        v_v.setBackgroundResource(R.drawable.rect)
        btn_rect.setOnClickListener {
            v_v.setBackgroundResource(R.drawable.rect)
        }
        btn_oval.setOnClickListener {
            v_v.setBackgroundResource(R.drawable.oval)
        }
    }
}