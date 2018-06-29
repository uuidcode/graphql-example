package net.ameizi.model;

import java.io.Serializable;

public class Book implements Serializable {
    private Long id;
    private String title;
    private String isbn;
    private Long pageCount;
    private Author author;

    public static Book of() {
        return new Book();
    }

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public Book setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getIsbn() {
        return isbn;
    }

    public Book setIsbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public Long getPageCount() {
        return pageCount;
    }

    public Book setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }

    public Author getAuthor() {
        return author;
    }

    public Book setAuthor(Author author) {
        this.author = author;
        return this;
    }
}
