package com.jjkopen.kdemo

import android.os.Handler
import android.view.View
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.layout_appbar.*

class SigninActivity : BaseActivity() {

    override fun bindViews() {
        setContentView(R.layout.activity_login)
    }

    override fun initActionBar() {
        appbar_back.visibility = View.GONE
        appbar_title.text = "Sign in"
    }

    override fun initView() {
        email_sign_in_button.setOnClickListener({
            login_progress.visibility = View.VISIBLE
            login_form.visibility = View.GONE
            Handler().postDelayed({ finish() }, 2000)
        })
    }

    override fun initData() {
            var strList = arrayListOf("jjkopen@hotmail.com", "jay chou", "jason")
            var adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strList)
            strList.add("wang")
            email.setAdapter(adapter)
    }



}
