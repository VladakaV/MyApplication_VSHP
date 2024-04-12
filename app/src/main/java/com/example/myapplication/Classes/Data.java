package com.example.myapplication.Classes;

public class Data {
    String title;
    String text;
    int id_image;
    int i;

    public Data(String title, String text, int id_image, int i) {
        this.title = title;
        this.text = text;
        this.id_image = id_image;
        this.i = i;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getId_image() {
        return id_image;
    }

    public void setId_image(int id_image) {
        this.id_image = id_image;
    }
    public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i = i;
    }
}
