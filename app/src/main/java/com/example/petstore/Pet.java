package com.example.petstore;

import java.util.ArrayList;
import java.util.List;

public class Pet {
    private CategoryList category;
    private String id;
    private String name;
    private ArrayList photoUrls;
    private String status;
    //private TagList tags;

    public CategoryList getCategory() { return category; }
    public void setCategory(CategoryList value) { this.category = value; }

    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public ArrayList getPhotoUrls() { return photoUrls; }
    public void setPhotoUrls(ArrayList value) { this.photoUrls = value; }

    public String getStatus() { return status; }
    public void setStatus(String value) { this.status = value; }

    //public TagList getTags() { return tags; }
    //public void setTags(TagList value) { this.tags = value; }
}

