package com.mad.readniggareadfin;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    ImageView cover;
    TextView name, author;
    ViewHolder(View view) {
        super(view);
        name = view.findViewById(R.id.name);
        author = view.findViewById(R.id.author);
        cover = view.findViewById(R.id.image);
    }
}
