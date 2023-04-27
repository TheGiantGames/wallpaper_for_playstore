package com.thegiantgames.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.thegiantgames.Wallpaper.R;
import com.thegiantgames.adapter.categoryAdapter;
import com.thegiantgames.adapter.wallpaperAdapter;
import com.thegiantgames.model.category;
import com.thegiantgames.model.wallpaper;

import java.util.ArrayList;
import java.util.List;


public class categoryFrag extends Fragment {

    View layout ;
    categoryAdapter adapter;
    RecyclerView recyclerView ;
    ProgressBar loader ;
    List<category> list = new ArrayList<>();



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      layout = inflater.inflate(R.layout.fragment_category, container, false);

        recyclerView = layout.findViewById(R.id.recylcer_category);
        loader = layout.findViewById(R.id.loader_category);
        adapter = new categoryAdapter(list , layout.getContext());
        recyclerView.setAdapter(adapter);

        loadWallpaper();

        return layout;
    }

    private void loadWallpaper(){

        list.add(new category( "" , " " ,""));
        list.add(new category( "" , " " ,""));
        list.add(new category( "" , " " ,""));
        list.add(new category( "" , " " ,""));
        list.add(new category( "" , " " ,""));
        list.add(new category( "" , " " ,""));
        list.add(new category( "" , " " ,""));


        adapter.notifyDataSetChanged();
        loader.setVisibility(View.GONE);


    }

}