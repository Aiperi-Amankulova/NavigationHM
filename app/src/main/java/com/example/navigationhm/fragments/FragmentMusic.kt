package com.example.navigationhm.fragments

import android.os.Bundle
import android.view.View
import androidx.work.Data
import com.example.navigationhm.R
import com.example.navigationhm.data.App
import com.example.navigationhm.data.Dao

class FragmentMusic : AbstractFragment() {
    override fun resId() = R.layout.bt_music_fragment
    private var database: Dao? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        database = App.app?.getDb()?.Data()
    }
}