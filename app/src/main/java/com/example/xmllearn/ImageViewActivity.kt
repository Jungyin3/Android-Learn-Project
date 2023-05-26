package com.example.xmllearn

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ImageViewActivity : AppCompatActivity() {
    private lateinit var img: ImageView
    private lateinit var img_btn: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.image_view)
        img = findViewById(R.id.img)
        img_btn = findViewById(R.id.img_btn)
//        设置fitType
        img.scaleType = ImageView.ScaleType.FIT_CENTER

        img_btn.setOnClickListener {
            println("img_btn按钮被点击了")
        }
    }
}