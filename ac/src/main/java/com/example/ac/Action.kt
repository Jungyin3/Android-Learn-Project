package com.example.ac

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

// 隐式Intent
class Action : AppCompatActivity() {
    private val intent = Intent();
    private val phone = "12345"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action)

        findViewById<Button>(R.id.btn_call).setOnClickListener {
//            设置意图动作 准备拨号
            intent.action = Intent.ACTION_DIAL
//            设置意图参数
            val uri = Uri.parse("tel:$phone")
            intent.data = uri
            startActivity(intent)
        }

        findViewById<Button>(R.id.btn_sms).setOnClickListener {
            intent.action = Intent.ACTION_SENDTO
            val uri = Uri.parse("smsto:$phone")
            intent.data = uri
            startActivity(intent)
        }

//        跳到我的App其他某个自定义界面
        findViewById<Button>(R.id.btn_jump).setOnClickListener {
            intent.action = "android.intent.action.lin"
            intent.addCategory(Intent.CATEGORY_DEFAULT)
            startActivity(intent)
        }

//        发送携带消息
        findViewById<Button>(R.id.btn_send).setOnClickListener {
            val i = Intent(this, Home::class.java);
            val bundle = Bundle();
            bundle.putString("key1", "123")
            bundle.putString("key2", "456789**")
            i.putExtras(bundle)
            startActivity(i)
        }
    }
}