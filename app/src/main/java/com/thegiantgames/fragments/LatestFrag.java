package com.thegiantgames.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.thegiantgames.Wallpaper.R;
import com.thegiantgames.adapter.wallpaperAdapter;
import com.thegiantgames.model.wallpaper;

import java.util.ArrayList;
import java.util.List;


public class LatestFrag extends Fragment {
    View layout;
    wallpaperAdapter adapter;
    RecyclerView recyclerView;
    ProgressBar loader;
    List<wallpaper> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        layout = inflater.inflate(R.layout.fragment_latest, container, false);


        recyclerView = layout.findViewById(R.id.recylcer_latest);
        loader = layout.findViewById(R.id.loader_latest);
        adapter = new wallpaperAdapter(list, layout.getContext());
        recyclerView.setAdapter(adapter);

        loadWallpaper();

        return layout;
    }

    private void loadWallpaper() {
        list.add(new wallpaper("", ""));
        list.add(new wallpaper("", ""));
        list.add(new wallpaper("", ""));
        list.add(new wallpaper("", ""));
        list.add(new wallpaper("", ""));
        list.add(new wallpaper("", ""));
        list.add(new wallpaper("", ""));
        list.add(new wallpaper("", ""));
        list.add(new wallpaper("", ""));
        list.add(new wallpaper("", ""));

        adapter.notifyDataSetChanged();
        loader.setVisibility(View.GONE);


    }

}