package net.ameizi.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import net.ameizi.model.Author;
import net.ameizi.model.Book;
import net.ameizi.repository.AuthorRepository;
import net.ameizi.repository.BookRepository;

public class Mutation implements GraphQLMutationResolver {

    private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    public Mutation(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    public Author newAuthor(String firstName, String lastName) {
        Author author = new Author();
        author.setFirstName(firstName);
        author.setLastName(lastName);
        authorRepository.save(author);
        return author;
    }

    public Book newBook(String title, String isbn, Integer pageCount, Long authorId) {
        Book book = new Book();
        book.setAuthor(new Author(authorId));
        book.setTitle(title);
        book.setIsbn(isbn);
        book.setPageCount(pageCount != null ? pageCount : 0L);
        bookRepository.save(book);
        return book;
    }

    public boolean deleteBook(Long id) {
        bookRepository.delete(id);
        return true;
    }

    public Book updateBookPageCount(Long pageCount, Long id) {
        Book book = bookRepository.findOne(id);
        book.setPageCount(pageCount);
        bookRepository.save(book);
        return book;
    }
}