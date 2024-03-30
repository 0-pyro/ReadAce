package com.mad.readniggareadfin;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class ReadFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_read, container, false);
    }
    //this shit took too long to figure out
    //for how simple it was
    //clearly i am stupid
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView rview = view.findViewById(R.id.recyclerview);
        List<Books> books = new ArrayList<>();
        books.add(new Books("A Dance with Dragons", "George R. R. Martin", R.drawable.dwdcover));
        rview.setLayoutManager(new LinearLayoutManager(getContext()));
        rview.setAdapter(new CustomAdapter(books));
    }
}