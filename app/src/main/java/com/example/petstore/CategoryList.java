package com.example.petstore;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class CategoryList {
    @SerializedName("category")
    ArrayList<Category> category;

}
