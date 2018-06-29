package net.ameizi.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import net.ameizi.model.Book;

@Repository
public interface BookDao {
    Book select(Long bookId);

    List<Book> selectList(Book book);

    long selectCount(Book book);

    List<Book> selectListForPayload(Book book);

    int selectCountForPayload(Book book);

    int insert(Book book);

    int update(Book book);

    int delete(Long bookId);

    int deleteForBatch(Book book);
}
