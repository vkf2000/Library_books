package com.example.library;

public class contain {
    private int image;
    private String text;


    contain(int image, String text){
        this.image=image;
        this.text=text;
    }
    public  String getText() {
        return text;
    }

    public  int getImage() {
        return image;
    }
}
