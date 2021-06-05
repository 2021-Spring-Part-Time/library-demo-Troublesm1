package org.wecancodeit.librarydemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

@DataJpaTest
public class JPAWiringTest {

    @Autowired
    private TestEntityManager entityManager;
    @Autowired
    private CampusRepository campusRepo;

    @Test
    public void CampusShouldHaveAListOfBooks() {
        Campus testCampus = new Campus("Test Location");
        Author testAuthor1 = new Author("Test firstName", "Test lastName  ");
        Book testBook = new Book("Title", "Description", testCampus, testAuthor1);

        authorRepo.save(testAuthor1);

    }
}
