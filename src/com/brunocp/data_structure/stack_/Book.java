package com.brunocp.data_structure.stack_;

public class Book {

    private String isbn;
    private String author;
    private int releaseDate;
    private String name;

    public Book() {
    }

    public Book(String isbn, String author, int releaseDate, String name) {
        this.isbn = isbn;
        this.author = author;
        this.releaseDate = releaseDate;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", author='" + author + '\'' +
                ", releaseDate=" + releaseDate +
                ", name='" + name + '\'' +
                '}';
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
