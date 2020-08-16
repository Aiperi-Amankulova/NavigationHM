package com.example.navigationhm.fragments

import android.os.Bundle
import android.view.View
import com.example.navigationhm.R
import com.example.navigationhm.ui.AdapterForPhone

class FragmentSearch : AbstractFragment()  {

    override fun resId()= R.layout.bt_search_fragment

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewPAge()
    }

    private fun setupViewPAge() {
        val adapter = AdapterForPhone(childFragmentManager)
    }
}