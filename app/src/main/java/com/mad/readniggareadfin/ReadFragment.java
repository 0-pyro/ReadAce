package com.mad.readniggareadfin;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class ReadFragment extends Fragment {

    List<Books> books;
    CustomAdapter cad;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_read, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView rview = view.findViewById(R.id.recyclerview);
        SearchView sview = view.findViewById(R.id.sview);
        books = new ArrayList<>();

        /*TODO: add books
            Life sucks get used to it. couldnt download for free/easily
            The girl with no dreams. couldnt download for free/easily
            We dream of space.
            Frankenstein.
            You only live once.
            A touch of eternity.
            Closer to nowhere.
            Again but better.
            The blue umbrella.
            Angels and demon- Dan Brown
            The girl with the dragon tattoo*/
        books.add(new Books("A Goog Girl's Guide to Murder", "Holly Jackson", R.drawable.agggtmcov, "A Good Girl's Guide to Murder"));
        books.add(new Books("The Fault in Our Stars", "John Green", R.drawable.tfioscov, "The-Fault-in-Our-Stars.pdf"));
        books.add(new Books("Random Thoughts of a Random Teenager", "Multiple Authors", R.drawable.rtoartcov, "random-thoughts-of-a-random-teenager.pdf"));
        books.add(new Books("Dance with Dragons", "George R. R. Martin", R.drawable.dwdcover, "Dance With Dragons.pdf"));
        books.add(new Books("Digital Principles and Applications", "Donal Leach", R.drawable.digprinc, "Digital Principles and Applications.pdf"));
        books.add(new Books("Java SE 8 for the Really Impatient", "Cay S. Horstmann", R.drawable.java8cov, "Java 8 for the Impatient.pdf"));
        books.add(new Books("Leviathan Wakes", "James S. A. Corey", R.drawable.levcover, "Leviathan Wakes.pdf"));
        books.add(new Books("Object Oriented Programming with C++", "Sourav Sahay", R.drawable.cppcov, "OOP with C++.pdf"));
        books.add(new Books("Engineering Physics", "B. DHANA PRASADA RAO", R.drawable.engiphycov, "PHYSICS.pdf"));
        cad = new CustomAdapter(books, this.getContext());
        sview.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filter(newText);
                return true;
            }
        });

        rview.setLayoutManager(new LinearLayoutManager(getContext()));
        rview.setAdapter(cad);
    }

    public void filter(String newText) {
        ArrayList<Books> filteredlist = new ArrayList<>();
        for(Books item : books) {
            if(item.getName().toLowerCase().contains(newText.toLowerCase())) {
                filteredlist.add(item);
            }
        } cad.filterList(filteredlist);
    }
}