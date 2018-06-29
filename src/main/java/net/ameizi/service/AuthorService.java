package net.ameizi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.ameizi.model.Payload;
import net.ameizi.dao.AuthorDao;
import net.ameizi.model.Author;

@Service
public class AuthorService {
    @Autowired
    private AuthorDao authorRepository;

    public Author select(Long authorId) {
        return this.authorRepository.select(authorId);
    }

    public List<Author> selectList(Author author) {
        return this.authorRepository.selectList(author);
    }

    public long selectCount(Author author) {
        return this.authorRepository.selectCount(author);
    }

    public Payload selectPayload(Author author) {
        List<Author> authorList = this.authorRepository.selectListForPayload(author);
        int totalCount = this.authorRepository.selectCountForPayload(author);
        int page = author.getPage();

        return Payload.of()
            .setAuthorList(authorList)
            .paging(page, 10, 10, totalCount);
    }

    public int insert(Author author) {
        return this.authorRepository.insert(author);
    }

    public int update(Author author) {
        return this.authorRepository.update(author);
    }

    public int delete(Author author) {
        return this.authorRepository.delete(author);
    }
}
