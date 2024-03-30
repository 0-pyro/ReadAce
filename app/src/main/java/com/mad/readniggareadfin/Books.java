package com.mad.readniggareadfin;

public class Books {
    public String name, author;
    public int image;

    public Books(String name, String author, int image) {
        this.name = name;
        this.author = author;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
