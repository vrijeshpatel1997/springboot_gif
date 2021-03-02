package com.teamtreehouse.giflib.model;

public class Category {

    int id ;
    String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
