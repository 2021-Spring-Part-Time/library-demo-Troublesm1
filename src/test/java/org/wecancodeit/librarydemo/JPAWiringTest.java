package org.wecancodeit.librarydemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.Optional;

@DataJpaTest
public class JPAWiringTest {

    @Autowired
    private TestEntityManager entityManager;
    @Autowired
    private CampusRepository campusRepo;
    @Autowired
    private AuthorRepository authorRepo;
    @Autowired
    private BookRepository bookRepo;

    @Test
    public void CampusShouldHaveAListOfBooks() {
        Campus testCampus = new Campus("Test Location");
        Author testAuthor1 = new Author("Test firstName", "Test lastName  ");
        Book testBook = new Book("Title", "Description", testCampus, testAuthor1);

        campusRepo.save(testCampus);
        authorRepo.save(testAuthor1);
        bookRepo.save(testBook);

        entityManager.flush();
        entityManager.clear();

        Optional<Campus> retrievedCampusOpt = campusRepo.findById(testCampus.getId());

    }
}
