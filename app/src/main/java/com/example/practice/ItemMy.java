package com.example.practice;

public class ItemMy {
    private String text;
    private int imageResource;

    public ItemMy(int imageResource, String text) {
        this.imageResource = imageResource;
        this.text = text;
    }

    public ItemMy(String text,int imageResource) {
        this.text = text;
        this.imageResource = imageResource;
    }

    public String getText() {
        return text;
    }
    public int getImageResource() {
        return imageResource;
    }
}
