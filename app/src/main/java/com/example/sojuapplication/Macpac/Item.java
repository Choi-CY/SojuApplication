package com.example.sojuapplication.Macpac;

import android.util.Log;

public class Item {
    int ID;
    String contents;
    int image;
    String title;

    int getID (){
        return this.ID;
    }
    String getContents(){
        return this.contents;
    }
    int getImage() {
        return this.image;
    }
    String getTitle() {
        return this.title;
    }

    Item(int id, String contents,String title, int image) {
        this.ID = id;
        this.contents = contents;
        this.image = image;
        this.title = title;

    }
}