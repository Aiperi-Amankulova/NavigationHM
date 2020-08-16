package com.example.navigationhm.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class AdapterTBLayout (fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager) {
    private var scrolling = arrayListOf<Fragment>()

    fun update(data: ArrayList<Fragment>) {
        this.scrolling = data
        notifyDataSetChanged()
    }

    override fun getItem(position: Int) = scrolling[position]
    override fun getCount() = scrolling.size
}