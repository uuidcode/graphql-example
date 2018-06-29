package net.ameizi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.ameizi.repository.AuthorRepository;
import net.ameizi.repository.BookRepository;
import net.ameizi.resolver.BookResolver;
import net.ameizi.resolver.Mutation;
import net.ameizi.resolver.Query;

@Configuration
public class GraphqlConfiguration {
    @Bean
    public BookResolver bookResolver(AuthorRepository authorRepository) {
        return new BookResolver(authorRepository);
    }

    @Bean
    public Query query(AuthorRepository authorRepository, BookRepository bookRepository) {
        return new Query(authorRepository, bookRepository);
    }

    @Bean
    public Mutation mutation(AuthorRepository authorRepository, BookRepository bookRepository) {
        return new Mutation(authorRepository, bookRepository);
    }

}
