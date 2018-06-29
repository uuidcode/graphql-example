package net.ameizi.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import net.ameizi.model.Book;

@Component
public class BookRepository {

    public Iterable<Book> findAll() {
        List<Book> list = new ArrayList<>();
        return list;
    }

    public long count() {
        return 0;
    }

    public void save(Book book) {
        System.out.println(book.getTitle() + "was saved!");
    }

    public void delete(Long id) {
        System.out.println("bookid " +id+ " was delete!");
    }

    public Book findOne(Long id) {
        return new Book();
    }
}
