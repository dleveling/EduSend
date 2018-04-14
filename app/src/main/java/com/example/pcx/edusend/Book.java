package com.example.pcx.edusend;

public class Book {

    private String Title;
    private String Category;
    private String Descrip;
    private int thumpnail;

    public Book() {

    }


    public Book(String title, String category, String descrip, int thumpnail) {
        Title = title;
        Category = category;
        Descrip = descrip;
        this.thumpnail = thumpnail;
    }

    public String getTitle() {
        return Title;
    }

    public String getCategory() {
        return Category;
    }

    public String getDescrip() {
        return Descrip;
    }

    public int getThumpnail() {
        return thumpnail;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setDescrip(String descrip) {
        Descrip = descrip;
    }

    public void setThumpnail(int thumpnail) {
        this.thumpnail = thumpnail;
    }
}
