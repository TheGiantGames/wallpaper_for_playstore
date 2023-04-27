package com.thegiantgames.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.thegiantgames.Wallpaper.R;
import com.thegiantgames.model.wallpaper;

import java.util.List;

public class wallpaperAdapter extends RecyclerView.Adapter<wallpaperAdapter.wallpaperHolder> {


    List<wallpaper> list ;
    Context context;

    public wallpaperAdapter(List<wallpaper> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public wallpaperHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new wallpaperHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_wallpapers , parent , false));
    }

    @Override
    public void onBindViewHolder(@NonNull wallpaperHolder holder, int position) {

        wallpaper wallpaper = list.get(position);

        Glide.with(context).load(wallpaper
                .getUrl()).error(R.drawable.cover).placeholder(R.drawable.cover)
                .skipMemoryCache(true).into(holder.cover);

        holder.itemView.setOnClickListener(v -> {

        });

    }

    @Override
    public int getItemCount() {

        return list.size();
    }

    public static class wallpaperHolder extends RecyclerView.ViewHolder{

        ImageView cover;


        public wallpaperHolder(@NonNull View itemView) {
            super(itemView);
            cover = itemView.findViewById(R.id.item_wallpaper_imageView);


        }
    }


}
