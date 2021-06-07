package org.wecancodeit.librarydemo;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.librarydemo.models.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
