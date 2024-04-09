package com.mad.readniggareadfin;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<ViewHolder> {
    public List<Books> localDataset;
    public Context con;

    public CustomAdapter(List<Books> books, Context context) {
        localDataset = books;
        con = context;
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

        viewHolder.cover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(con, ReadActivity.class);
                Bundle b = new Bundle();
                b.putString("filename", localDataset.get(viewHolder.getAdapterPosition()).getFilename());
                i.putExtras(b);
                con.startActivity(i);
            }
        });
        viewHolder.name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(con, ReadActivity.class);
                Bundle b = new Bundle();
                b.putString("filename", localDataset.get(viewHolder.getAdapterPosition()).getFilename());
                i.putExtras(b);
                con.startActivity(i);
            }
        });
        viewHolder.author.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(con, ReadActivity.class);
                Bundle b = new Bundle();
                b.putString("filename", localDataset.get(viewHolder.getAdapterPosition()).getFilename());
                i.putExtras(b);
                con.startActivity(i);
            }
        });
    }
    @Override
    public int getItemCount() {
        return localDataset.size();
    }
    public void filterList(ArrayList<Books> filteredlist) {
        localDataset = filteredlist;
        notifyDataSetChanged();
    }
}
