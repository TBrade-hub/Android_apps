package com.example.flow;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;


public class HomeFragment extends Fragment {


    //// here was goin to be the users home profile page
    /// the page was going top be connected to googles firebase to retrieve all of the saved data about the user
    //  validation  or the users account has been done in other project and can be added later
    //
    private View image_1,image_2,image_3;
    private RecyclerView products_List;
    RecyclerView.LayoutManager layoutcontroller;
    private DatabaseReference User_leaderRef;
    private String currentUserID;
    FirebaseUser CurrUser;
    private FirebaseAuth fireDBAuth;
    ImageView  image_One,imageView ;
    ImageButton bt_on;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        settingVariables();





        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }


    //// methods will go here

    private void settingVariables()
    {
        //variable to be to be used in this activity
        //bt_on = bt_on.findViewById(R.id.img_bt);

    }

    public void scrollToTop(View v) {


    }

}
