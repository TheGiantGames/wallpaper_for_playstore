package com.thegiantgames.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thegiantgames.Wallpaper.R;


public class Favourite extends Fragment {

    View layout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        layout =  inflater.inflate(R.layout.fragment_favourite, container, false);
        return layout ;
     }
}