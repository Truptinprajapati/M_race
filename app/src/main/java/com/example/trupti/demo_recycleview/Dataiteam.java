package com.example.trupti.demo_recycleview;

/**
 * Created by Lenovo on 19-07-2017.
 */

public class Dataiteam {
    private String title;
    private int imageUrl;

    // cons pass//
    public Dataiteam(String title, int imageUrl) {

        this.title = title;
        this.imageUrl = imageUrl;

    }


    public String getTitle() {
        return title;
    }
// getter with a pass//
    public int getImageUrl() {
        return imageUrl;
    }
}