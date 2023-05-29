package com.example.shape

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox

class CheckBoxs : AppCompatActivity() {
    private lateinit var checkbox: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)

        checkbox = findViewById(R.id.checkbox)
        checkbox.setOnCheckedChangeListener { buttonView, isChecked ->
            buttonView.text = "你${if (isChecked) "选中了" else "未选中"}了"
        }
//        checkbox.isChecked
    }
}