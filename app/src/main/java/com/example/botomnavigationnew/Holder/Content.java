package com.example.botomnavigationnew.Holder;

public class Content {
    private String name;

    public Content(String name) {
        this.name = name;
    }

    public String getName(int adapterPosition) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}