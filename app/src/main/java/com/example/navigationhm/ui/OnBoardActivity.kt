package com.example.navigationhm.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.navigationhm.R
import com.example.navigationhm.data.DataClass
import com.example.navigationhm.fragments.OnBoardFragment
import kotlinx.android.synthetic.main.activity_tablayout.*

class OnBoardActivity : AppCompatActivity() {
    private val scrolling = arrayListOf<Fragment>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tablayout)
        setupViewPager()
        setupListener()
    }

    private fun setupListener() {
        page.setOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {}


            override fun onPageSelected(position: Int) {
                if (checktopage(position)) {
                    btnNext2.text = "Go to next page"
                } else {
                    btnNext2.text = "Next"
                }
            }
        })
        btnNext2.setOnClickListener {
            if (checktopage(page.currentItem)) {
                startActivity(Intent(this, BottActivity::class.java))  //
                finish()
            } else {
                page.currentItem += 1
            }
        }
    }

    private fun checktopage(position: Int) = position == scrolling.size - 1


    private fun setupViewPager() {
        val adapter =  AdapterTBLayout(supportFragmentManager)
        page.adapter = adapter

        scrolling.add(OnBoardFragment.getInstance(DataClass(R.drawable.fir )))
        scrolling.add(OnBoardFragment.getInstance(DataClass(R.drawable.fir )))
        scrolling.add(OnBoardFragment.getInstance(DataClass(R.drawable.fir )))
        adapter.update(scrolling)
        tbLayout.setupWithViewPager(page)
    }
}



