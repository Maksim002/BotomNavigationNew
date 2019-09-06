package com.example.botomnavigationnew.Holder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.botomnavigationnew.R;

import java.util.List;

public class Adaptor extends RecyclerView.Adapter<ResViewHolder> {

    private List<Content> contents;
    private Listener listener;

    public Adaptor(List<Content> contents, Listener listener) {
        this.contents = contents;
        this.listener = listener;
    }


    @NonNull
    @Override
    public ResViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.expandable_initi_company,viewGroup,false);
        return new ResViewHolder(view,listener);
    }

    @Override
    public void onBindViewHolder(@NonNull ResViewHolder resViewHolder, int position) {
        resViewHolder.bind(contents.get(position));
    }

    @Override
    public int getItemCount() {
        return contents.size();
    }
}
