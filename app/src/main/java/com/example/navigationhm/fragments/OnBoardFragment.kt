package com.example.navigationhm.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.navigationhm.R
import com.example.navigationhm.data.DataClass

class OnBoardFragment  : Fragment() {

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            return inflater.inflate(R.layout.activity_tablayout, container, false)
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            upView()
        }

        private fun upView() {
            val data = arguments?.get(DATA_ID) as DataClass
            img.setImageResource(data.image)
        }

        companion object {
            const val DATA_ID = "DATA_ID"

            fun getInstance(data: DataClass): OnBoardFragment {
                val fragment = OnBoardFragment()
                val bundle = Bundle()
                bundle.putParcelable(DATA_ID, data)
                fragment.arguments = bundle
                return fragment
            }
        }
    }
