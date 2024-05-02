package com.example.petstore;

public class Pet {
    private Category category;
    private String id;
    private String name;
    private PhotoUrls photoUrls;
    private String status;
    private Tags tags;

    public Category getCategory() { return category; }
    public void setCategory(Category value) { this.category = value; }

    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public PhotoUrls getPhotoUrls() { return photoUrls; }
    public void setPhotoUrls(PhotoUrls value) { this.photoUrls = value; }

    public String getStatus() { return status; }
    public void setStatus(String value) { this.status = value; }

    public Tags getTags() { return tags; }
    public void setTags(Tags value) { this.tags = value; }
}

