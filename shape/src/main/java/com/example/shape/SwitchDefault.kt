package com.example.shape

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import android.widget.TextView

class SwitchDefault : AppCompatActivity() {
    private lateinit var sw: Switch;
    private lateinit var tv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_switch_default)

        sw = findViewById(R.id.sw)
        tv = findViewById(R.id.tv)

        sw.setOnCheckedChangeListener { buttonView, isChecked ->
            tv.text = if (isChecked) "当前的Swtich状态为 选中" else "当前的Swtich状态为 未选中"
        }
    }
}