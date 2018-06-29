package net.ameizi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.ameizi.model.Payload;
import net.ameizi.dao.BookDao;
import net.ameizi.model.Book;

@Service
public class BookService {
    @Autowired
    private BookDao bookRepository;

    public Book select(Long bookId) {
        return this.bookRepository.select(bookId);
    }

    public List<Book> selectList(Book book) {
        return this.bookRepository.selectList(book);
    }

    public long selectCount(Book book) {
        return this.bookRepository.selectCount(book);
    }

    public Payload selectPayload(Book book) {
        List<Book> bookList = this.bookRepository.selectListForPayload(book);
        int totalCount = this.bookRepository.selectCountForPayload(book);
        int page = book.getPage();

        return Payload.of()
            .setBookList(bookList)
            .paging(page, 10, 10, totalCount);
    }

    public int insert(Book book) {
        return this.bookRepository.insert(book);
    }

    public int update(Book book) {
        return this.bookRepository.update(book);
    }

    public int delete(Long bookId) {
        return this.bookRepository.delete(bookId);
    }
}
