package net.ameizi.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import net.ameizi.dao.AuthorDao;
import net.ameizi.dao.BookDao;
import net.ameizi.model.Author;
import net.ameizi.model.Book;

@Service
public class Mutation implements GraphQLMutationResolver {
    @Autowired
    private BookDao bookDao;

    @Autowired
    private AuthorDao authorDao;

    public Author newAuthor(String firstName, String lastName) {
        Author author = new Author();
        author.setFirstName(firstName);
        author.setLastName(lastName);
        this.authorDao.insert(author);
        return author;
    }

    public Book newBook(String title, String isbn, Long pageCount, Long authorId) {
        return Book.of()
            .setTitle(title)
            .setIsbn(isbn)
            .setPageCount(pageCount)
            .setAuthorId(authorId);
    }

    public boolean deleteBook(Long bookId) {
        this.bookDao.delete(bookId);
        return true;
    }

    public Book updateBookPageCount(Long bookId, Long pageCount) {
        Book book = this.bookDao.select(bookId);
        book.setPageCount(pageCount);
        this.bookDao.update(book);
        return book;
    }
}