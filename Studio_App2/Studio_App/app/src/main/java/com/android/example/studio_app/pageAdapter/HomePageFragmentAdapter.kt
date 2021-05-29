package com.android.example.studio_app.pageAdapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.android.example.studio_app.Home_Main
import com.android.example.studio_app.fragments.Booking_Frag
import com.android.example.studio_app.fragments.Home_Frag
import com.android.example.studio_app.fragments.Portfolio_frag


class HomePageFragmentAdapter(private val myContext: Context, fm: FragmentManager, internal var totaltabs:Int): FragmentPagerAdapter(fm) {



    override fun getCount(): Int {
        return totaltabs
    }


    override fun getItem(position: Int): Fragment {
         return when(position){
            0 ->  Home_Frag()
            1 ->  Booking_Frag()
            2 ->  Portfolio_frag()
            else -> Home_Frag()
        }
    }

}