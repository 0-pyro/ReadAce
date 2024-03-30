package com.mad.readniggareadfin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<ViewHolder> {
    public List<Books> localDataset;
    public CustomAdapter(List<Books> books) {
        localDataset = books;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.text_row_item, viewGroup, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        viewHolder.name.setText(localDataset.get(position).getName());
        viewHolder.author.setText(localDataset.get(position).getAuthor());
        viewHolder.cover.setImageResource(localDataset.get(position).getImage());
    }
    @Override
    public int getItemCount() {
        return localDataset.size();
    }
}
