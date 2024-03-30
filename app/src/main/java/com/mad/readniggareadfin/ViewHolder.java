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
        name = (TextView) view.findViewById(R.id.name);
        author = (TextView) view.findViewById(R.id.author);
        cover = (ImageView) view.findViewById(R.id.cover);
    }
}
