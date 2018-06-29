package net.ameizi.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import net.ameizi.dao.AuthorDao;
import net.ameizi.dao.BookDao;
import net.ameizi.model.Author;
import net.ameizi.model.Book;

@Service
public class Query implements GraphQLQueryResolver {
    @Autowired
    private BookDao bookDao;

    @Autowired
    private AuthorDao authorDao;

    public Iterable<Book> findAllBooks() {
        return this.bookDao.selectList(Book.of());
    }

    public Iterable<Author> findAllAuthors() {
        return this.authorDao.selectList(Author.of());
    }

    public Long countBooks() {
        return this.bookDao.selectCount(Book.of());
    }

    public Long countAuthors() {
        return this.authorDao.selectCount(Author.of());
    }
}
