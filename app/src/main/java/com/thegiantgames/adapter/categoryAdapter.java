package com.thegiantgames.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.thegiantgames.Wallpaper.R;
import com.thegiantgames.model.category;
import com.thegiantgames.model.wallpaper;

import java.util.ConcurrentModificationException;
import java.util.List;

public class categoryAdapter  extends RecyclerView.Adapter<categoryAdapter.categoryHolder> {


    List<category> list ;
    Context context;

    public categoryAdapter(List<category> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public categoryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new categoryHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category , parent , false));
    }

    @Override
    public void onBindViewHolder(@NonNull categoryHolder holder, int position) {

        category category = list.get(position);
        holder.title.setText(category.getTitle());

        Glide.with(context).load(category
                        .getCover()).error(R.drawable.cover).placeholder(R.drawable.cover)
                .skipMemoryCache(true).into(holder.cover);

        holder.itemView.setOnClickListener(v -> {

        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class categoryHolder extends RecyclerView.ViewHolder{

        ImageView cover ;
        TextView title ;
        public categoryHolder(@NonNull View itemView) {
            super(itemView);

            cover = itemView.findViewById(R.id.item_category_image);
            title = itemView.findViewById(R.id.item_category_title);

        }
    }


}
