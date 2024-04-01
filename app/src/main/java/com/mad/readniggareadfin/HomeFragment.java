package com.mad.readniggareadfin;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageView b1, b2, b3, b4;
        b1 = view.findViewById(R.id.book1);
        b2 = view.findViewById(R.id.book2);
        b3 = view.findViewById(R.id.book3);
        b4 = view.findViewById(R.id.book4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), ReadActivity.class);
                Bundle b = new Bundle();
                b.putString("filename", "Dance With Dragons.pdf");
                i.putExtras(b);
                v.getContext().startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), ReadActivity.class);
                Bundle b = new Bundle();
                b.putString("filename", "Dance With Dragons.pdf");
                i.putExtras(b);
                v.getContext().startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), ReadActivity.class);
                Bundle b = new Bundle();
                b.putString("filename", "Dance With Dragons.pdf");
                i.putExtras(b);
                v.getContext().startActivity(i);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), ReadActivity.class);
                Bundle b = new Bundle();
                b.putString("filename", "Dance With Dragons.pdf");
                i.putExtras(b);
                v.getContext().startActivity(i);
            }
        });
    }
}