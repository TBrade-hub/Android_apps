package com.example.flow;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class Home_Main extends AppCompatActivity {

    /// this activity function as the first activity the user will see
    // there will be three tabs that will be connected to three fragments
    //


    //tab instances
    TabLayout tb_layout;
    TabItem TabOne,TabTwo,TabThree;
    App_Accessor SectionsAccessor;

    //navigation and side draw
    ViewPager tabs_view;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle Toggle;
    NavigationView navigationView;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__main);
        settingVariables();


        tb_layout = findViewById(R.id.tabs_Layout);
        SectionsAccessor = new App_Accessor( getSupportFragmentManager(),tb_layout.getTabCount(),tb_layout.getTabCount() );

        tabs_view = findViewById(R.id.viewPager);
        //uncomment shouild we add the tool bar back
        //Toolbar ToolBar = findViewById(R.id.toolbar);
       // setSupportActionBar(ToolBar);

        tabs_view.setAdapter(SectionsAccessor);
        tb_layout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                tabs_view.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
        tabs_view.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tb_layout));






    }
    //methods will go here /////////////////////

    private void settingVariables()
    {
        //void function to set variable to be used through out activity such as findbyid


    }

}
