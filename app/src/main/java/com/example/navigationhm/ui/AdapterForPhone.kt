package com.example.navigationhm.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class AdapterForPhone (fragment : FragmentManager): FragmentStatePagerAdapter(fragment) {

    private var scrolling = arrayListOf<Fragment>()

    fun addFragment(fragmen: Fragment ){
        scrolling.add(fragmen)
        notifyDataSetChanged()
    }

    override fun getItem(position: Int)=scrolling[position]
    override fun getCount()=  scrolling.size
}