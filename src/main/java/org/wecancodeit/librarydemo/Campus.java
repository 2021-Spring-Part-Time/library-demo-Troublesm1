package org.wecancodeit.librarydemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Campus {


    @Id
    @GeneratedValue
    private Long id;
    private String location;
    @OneToMany
    private Collection<Book> books;

    public Long getId() {
        return id;
    }
    //default no arg constructor required for jpa
    public Campus(){
    }

    public Campus(String location) {
        this.location = location;
    }

    public Collection<Book> getBooks() {
        return books;
    }
}
