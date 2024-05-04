package com.example.petstore;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Category {
    List<Category> categories;
    private String id;
    @SerializedName("name")
    private String name;

    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }
}