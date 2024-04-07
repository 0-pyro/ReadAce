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
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView rview = view.findViewById(R.id.recyclerview);
        List<Books> books = new ArrayList<>();
        books.add(new Books("Dance with Dragons", "George R. R. Martin", R.drawable.dwdcover, "Dance With Dragons.pdf"));
        books.add(new Books("Digital Principles and Applications", "Donal Leach", R.drawable.digprinc, "Digital Principles and Applications.pdf"));
        books.add(new Books("Java SE 8 for the Really Impatient", "Cay S. Horstmann", R.drawable.java8cov, "Java 8 for the Impatient.pdf"));
        books.add(new Books("Leviathan Wakes", "James S. A. Corey", R.drawable.levcover, "Leviathan Wakes.pdf"));
        books.add(new Books("Object Oriented Programming with C++", "Sourav Sahay", R.drawable.cppcov, "OOP with C++.pdf"));
        books.add(new Books("Engineering Physics", "B. DHANA PRASADA RAO", R.drawable.engiphycov, "PHYSICS.pdf"));

        rview.setLayoutManager(new LinearLayoutManager(getContext()));
        rview.setAdapter(new CustomAdapter(books, this.getContext()));
    }
}