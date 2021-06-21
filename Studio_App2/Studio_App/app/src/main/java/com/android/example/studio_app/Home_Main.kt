package com.android.example.studio_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.viewpager.widget.ViewPager
import com.android.example.studio_app.pageAdapter.HomePageFragmentAdapter
import com.google.android.material.tabs.TabLayout
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class Home_Main : AppCompatActivity() {
    // viewPager




    private companion object {
        private lateinit var tabViewAdapter: HomePageFragmentAdapter
        private lateinit var viewPager: ViewPager
        private lateinit var tabLayout: TabLayout
        private const val TAG = "Home_main"
    }



    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_main)
        auth = Firebase.auth


        setUpViewPager()

    }






    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //Inflates the menu
        menuInflater.inflate(R.menu.logout_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.miLogout){

            Log.i(TAG, " Logout")
            auth.signOut()
            val logOutIntent = Intent(this, MainActivity::class.java)
            logOutIntent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(logOutIntent)

        }
        return super.onOptionsItemSelected(item)
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