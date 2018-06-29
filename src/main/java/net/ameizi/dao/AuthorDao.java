package net.ameizi.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import net.ameizi.model.Author;

@Repository
public interface AuthorDao {
    Author select(Long authorId);

    List<Author> selectList(Author author);

    long selectCount(Author author);

    List<Author> selectListForPayload(Author author);

    int selectCountForPayload(Author author);

    int insert(Author author);

    int update(Author author);

    int delete(Author author);

    int deleteForBatch(Author author);
}
