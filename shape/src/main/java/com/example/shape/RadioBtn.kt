package com.example.shape

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import android.widget.TextView

class RadioBtn : AppCompatActivity() {
    private lateinit var rg_gender: RadioGroup
    private lateinit var tv_r: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_btn)

        rg_gender = findViewById(R.id.rg_gender)
        tv_r = findViewById(R.id.tv_r)

        rg_gender.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.rb_male -> tv_r.text = "帅气男孩"
                else -> tv_r.text = "漂亮女孩"
            }
        }
    }
}