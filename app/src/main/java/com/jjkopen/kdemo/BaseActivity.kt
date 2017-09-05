package com.jjkopen.kdemo

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.inputmethod.InputMethodManager

/**
 * Created on 2017/9/1.
 */
abstract class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindViews()
        initActionBar()
        initView()
        initData()
    }

    /**
     *  setContentView
     */
    abstract fun bindViews()

    abstract fun initActionBar()

    abstract fun initView()

    abstract fun initData()

    fun hideKeyboard() {
        val view = currentFocus
        if (view != null) {
            (getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager).
                    hideSoftInputFromWindow(view.windowToken, InputMethodManager.HIDE_NOT_ALWAYS)
        }
    }
}
