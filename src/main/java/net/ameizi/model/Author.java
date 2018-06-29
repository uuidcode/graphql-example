package net.ameizi.model;

import java.io.Serializable;

public class Author implements Serializable{
    private Long id;
    private String firstName;
    private String lastName;

    public static Author of() {
        return new Author();
    }

    public Author() {
    }

    public Author(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Author setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Author setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Author setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
}
