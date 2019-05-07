package com.example.myapplication;

/**
 * Created by 杨美端 on 2019/5/7.
 */
public class myClass {
    private String title;
    private String text;

    public myClass(String title, String text) {
        this.title = title;
        this.text = text;
    }
    public myClass(String title ) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
