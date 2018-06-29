package net.ameizi.model;

import java.util.List;

public class Payload extends CoreObject<Payload> {
    private List<Author> authorList;
    private List<Book> bookList;

    public List<Book> getBookList() {
        return this.bookList;
    }

    public Payload setBookList(List<Book> bookList) {
        this.bookList = bookList;
        return this;
    }

    public static Payload of() {
        return new Payload();
    }

    public List<Author> getAuthorList() {
        return this.authorList;
    }

    public Payload setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
        return this;
    }
}
