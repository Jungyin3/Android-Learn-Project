package com.example.ac

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

/**
 * Activity生命周期 依次往下
 *
 * onCreate 创建活动，页面布局加入内存，进入初始状态
 * onStart 开始活动，活动界面显示屏幕，进入就绪状态
 * onResume 恢复活动，界面进入活动状态，可进行交互
 * onPause 暂停活动，界面不能进行交互
 * onStop 停止活动，页面不在屏幕上显示
 * onDestroy 销毁活动，将页面从内存中清楚
 * onRestart 重启活动，重新加载内存中的活动界面
 * onNewIntent 重用已有活动
 *
 * 打开界面：onCreate - onStart - onResume
 * 关闭界面：onPause - onStop - onDestroy
 * */
class LifeCycle : AppCompatActivity() {
    private val tag = "zhanglin"

//    全局唯一执行一次
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)
        Log.d(tag, "onCreate")

        findViewById<Button>(R.id.btn).setOnClickListener {
            startActivity(Intent(this, second::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "onDestroy")
    }
}