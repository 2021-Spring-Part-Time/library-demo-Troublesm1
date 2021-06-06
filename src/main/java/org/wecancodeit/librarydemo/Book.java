package org.wecancodeit.librarydemo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
    @ManyToOne
    private Campus campus;
    @ManyToMany
    private Collection<Author> authors;

    public Long getId() {
        return id;
    }

    public Book () {

    }

    public Book(String title, String description, Campus campus, Author...authors) {
        this.title= title;
        this.description= description;
        this.campus= campus;
        this.authors= new ArrayList<>(Arrays.asList(authors));

    }

}
