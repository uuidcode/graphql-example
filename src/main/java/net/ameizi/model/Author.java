package net.ameizi.model;

public class Author extends CoreObject<Author> {
    private Long authorId;
    private String lastName;
    private String firstName;

    public Long getAuthorId() {
        return this.authorId;
    }

    public Author setAuthorId(Long authorId) {
        this.authorId = authorId;
        return this;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Author setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public Author setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public static Author of() {
        return new Author();
    }
}