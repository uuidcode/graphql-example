package net.ameizi.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import net.ameizi.model.Author;

@Component
public class AuthorRepository {

    public Iterable<Author> findAll() {
        List<Author> list = new ArrayList<>();
        return list;
    }

    public long count() {
        return 0;
    }

    public void save(Author author) {
        System.out.println(author.getFirstName()+author.getLastName() + " was saved!");
    }

    public Author findOne(Long id) {
        return new Author();
    }
}
