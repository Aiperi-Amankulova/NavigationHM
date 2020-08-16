package com.example.navigationhm.fragments

import android.os.Bundle
import android.view.View
import com.example.navigationhm.R
import com.example.navigationhm.data.App
import com.example.navigationhm.data.Dao

class FragmentHome : AbstractFragment() {
    override fun resId()= R.layout.bt_home_fragment

    private var database: Dao?=null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        database= App.app?.getDb()?.Data()
    }
}