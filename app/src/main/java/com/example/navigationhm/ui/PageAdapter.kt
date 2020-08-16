package com.example.navigationhm.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class PageAdapter (manager: FragmentManager): FragmentStatePagerAdapter(manager) {

    private val scrolling = arrayListOf<Fragment>()

    fun addFragment(fragment: Fragment){
        scrolling.add(fragment)
        notifyDataSetChanged()
    }
    override fun getItem(position: Int)=scrolling[position]

    override fun getCount() = scrolling.size
}