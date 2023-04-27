package com.thegiantgames.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class favAdapter extends RecyclerView.Adapter<favAdapter.favHolder> {

    @NonNull
    @Override
    public favHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull favHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class favHolder extends RecyclerView.ViewHolder{

    public favHolder(@NonNull View itemView) {
        super(itemView);
    }
}

}
