package com.example.flow;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class App_Accessor extends FragmentPagerAdapter
{
    private int tabsNumber;

    public App_Accessor(@NonNull FragmentManager FragManger, int behavior, int tabs) {
        super(FragManger, behavior);
        this.tabsNumber = tabs;
    }


    // the different sections of the tabs will be linked to the java files
    @NonNull
    //switch function in order to know where which tab the user has selected
    public Fragment getItem(int P) {
        //return null;
        //switch statement that controls what fragment will be initiated
        //
        switch (P)
        {
            case 0:
                return new HomeFragment() ;

            case 1:
                return new booking_fragment();

            case 2:
                return new portfolio_frag() ;


            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabsNumber;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Home ";

            case 1:
                return "Booking";

            case 2:
                return "Portfolio ";

            default:
                return null;
        }
    }
}
