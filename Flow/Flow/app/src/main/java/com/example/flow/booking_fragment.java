package com.example.flow;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * simple booking fragment made incase for the booking system this can be both
 * uses hasnt been decided yet but can be used as a quick way for the user to be abole to book appointments
 * or as a way for useds to be able to view all of the goods and services that can be provided
 */
public class booking_fragment extends Fragment {

    public booking_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_booking_fragment, container, false);


    }

    /////methods down bellow "remember them cold nights i was sleeping in the dirt "


}
