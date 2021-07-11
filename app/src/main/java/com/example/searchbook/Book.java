package com.example.searchbook;

public class Book {

    private String title;
    private String author;
    private String imageUrl;
    private String mUrl;

    public Book(String bookTitle, String authorName,String url,String image)
    {
        this.title = bookTitle;
        this.author = authorName;
        this.mUrl=url;
        imageUrl=image;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getUrl() {
        return mUrl;
    }
}
