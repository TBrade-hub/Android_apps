package com.android.example.studio_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.android.example.studio_app.pageAdapter.HomePageFragmentAdapter
import com.google.android.material.tabs.TabLayout

class Home_Main : AppCompatActivity() {
    // viewPager
    private lateinit var tabViewAdapter: HomePageFragmentAdapter
    private lateinit var viewPager: ViewPager
    private lateinit var tabLayout: TabLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_main)
        setUpViewPager()

    }


    private fun setUpViewPager() {
        setUpTabLayout()

    }

    private fun setUpTabLayout() {
        // Tab Layout
        tabLayout = findViewById(R.id.tabs_Layout)

        // Create an instance of the HomePageFragmentAdapter
        tabViewAdapter = HomePageFragmentAdapter(this, supportFragmentManager, tabLayout.tabCount)
        // make an instance of the viewPager
        viewPager = findViewById(R.id.viewPager)

        viewPager.adapter = tabViewAdapter

        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))




        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewPager.currentItem = tab!!.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })

    }
}