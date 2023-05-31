package com.example.shape

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import java.util.Calendar

class CanladerActivity : AppCompatActivity() {
    private lateinit var calender: DatePicker;
    private lateinit var btn_ok: Button;
    private lateinit var tv_date: TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_canlader)

        calender = findViewById(R.id.dp)
        btn_ok = findViewById(R.id.btn_ok)
        tv_date = findViewById(R.id.tv_date)

        btn_ok.setOnClickListener {
            val desc =
                "当前选择时间为: ${calender.year}年${calender.month + 1}月${calender.dayOfMonth}日";
            tv_date.text = desc
        }

//        Dialog形式的选择日期
        findViewById<Button>(R.id.btn_date).setOnClickListener {
            val dialogDatePicker = DatePickerDialog(this)
        }
    }
}