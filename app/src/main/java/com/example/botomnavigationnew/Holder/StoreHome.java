package com.example.botomnavigationnew.Holder;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.botomnavigationnew.R;

import java.util.ArrayList;
import java.util.List;

class StoreHome extends Fragment implements Listener{

    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news, container, false);

        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setAdapter(new Adaptor(getList(),this));

        return view;
    }
    List<Content> getList(){
        List<Content> context = new ArrayList<>();
        context.add(new Content("Hobbit"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        context.add(new Content("Sherlock Holmes"));
        return context;
    }

    @Override
    public void onClikGaleri(int adapterPosition) {

    }
}
