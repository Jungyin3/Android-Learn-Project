package com.example.shape.utils

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager

class ViewUtil {
    /**
     * 关闭虚拟键盘
     * */
    fun hideKeyboard(v: View) {
        val inputManager =
            v.context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputManager.hideSoftInputFromWindow(v.windowToken, 0)
    }
}