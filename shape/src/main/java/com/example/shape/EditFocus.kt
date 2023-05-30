package com.example.shape

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import android.text.TextWatcher
import android.widget.EditText
import android.widget.Toast
import com.example.shape.utils.ViewUtil

class EditFocus : AppCompatActivity() {
    private lateinit var et_phone: EditText;
    private lateinit var et_password: EditText;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_focus)

        et_phone = findViewById(R.id.et_phone)
        et_password = findViewById(R.id.et_password)

//        设置focus监听事件，如果et_phone不足11位则给et_phone重新的焦点
        et_password.setOnFocusChangeListener { v, hasFocus ->
            if (hasFocus) {
                val phone = et_phone.text.toString();
                if (TextUtils.isEmpty(phone) || phone.length < 11) {
                    et_phone.requestFocus();
                    Toast.makeText(this, "账号输入错误", Toast.LENGTH_SHORT).show()
                }
            }
        }

//        设置内容监听器
        et_phone.addTextChangedListener(HideWatcher(et_phone, 11))
    }

    class HideWatcher(var target: EditText, var maxLength: Int) : TextWatcher {
        //    改变前
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        }

        //    改变中
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        }

        //    变化后
        override fun afterTextChanged(s: Editable?) {
            val content = s?.toString() ?: ""
            if (content.length == maxLength) {
//            隐藏键盘
                ViewUtil().hideKeyboard(target)
            }
        }
    }
}


