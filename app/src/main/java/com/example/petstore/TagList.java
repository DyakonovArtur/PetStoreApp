package com.example.petstore;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class TagList {
    @SerializedName("tags")
    ArrayList<Tags> tags;
}
