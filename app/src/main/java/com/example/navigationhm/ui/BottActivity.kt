package com.example.navigationhm.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.navigationhm.R
import com.example.navigationhm.fragments.FragmentHome
import com.example.navigationhm.fragments.FragmentMusic
import com.example.navigationhm.fragments.FragmentSearch
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.on_boading_frag.*


class BottActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpBottNavigation()
        setUpLT()
    }

    private var View.adapter: PageAdapter
        get() {}
        set() {}

    private fun setUpBottNavigation() {
        val adapter= PageAdapter(
            supportFragmentManager
        )
        cvPage.adapter = adapter
        adapter.addFragment(FragmentMusic())
        adapter.addFragment(FragmentSearch())
        adapter.addFragment(FragmentHome())
    }
    private fun setUpLT() {
        btnNext.setOnNavigationItemSelectedListener {
            when (it.itemId){
                R.id.music -> cvPage
                R.id.search-> cvPage
                R.id.home -> cvPage

            }
            return@setOnNavigationItemSelectedListener true
        }
    }
}