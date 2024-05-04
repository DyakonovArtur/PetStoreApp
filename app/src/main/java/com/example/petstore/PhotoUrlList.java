package com.example.petstore;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class PhotoUrlList {

    @SerializedName("photoUrls")
    ArrayList<PhotoUrls> photoUrls;
}
