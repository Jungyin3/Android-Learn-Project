package com.example.shape

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Alert : AppCompatActivity() {
    private lateinit var btn_dialog: Button;
    private lateinit var tv_result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert)

        btn_dialog = findViewById(R.id.btn_dialog)
        tv_result = findViewById(R.id.tv_result)

        btn_dialog.setOnClickListener {
            val dialogInstance = AlertDialog.Builder(this);

            dialogInstance.setTitle("尊敬的用户:")
            dialogInstance.setMessage("你确定要卸载此App吗？")
//            消极
            dialogInstance.setPositiveButton("确定") { dialog, which ->
                tv_result.text = "您已同意"
            }
//            积极
            dialogInstance.setNegativeButton("取消") { dialog, which ->
                tv_result.text = "您已取消"
            }

//            创建
            val dialog = dialogInstance.create();
            dialog.show();
        }
    }
}