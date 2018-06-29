package net.ameizi.model;

public class Book extends CoreObject<Book> {
    private Long bookId;
    private String title;
    private String isbn;
    private Long pageCount;
    private Long authorId;

    public Long getBookId() {
        return this.bookId;
    }

    public Book setBookId(Long bookId) {
        this.bookId = bookId;
        return this;
    }

    public String getTitle() {
        return this.title;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public Book setIsbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public Long getPageCount() {
        return this.pageCount;
    }

    public Book setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }

    public Long getAuthorId() {
        return this.authorId;
    }

    public Book setAuthorId(Long authorId) {
        this.authorId = authorId;
        return this;
    }

    public static Book of() {
        return new Book();
    }
}