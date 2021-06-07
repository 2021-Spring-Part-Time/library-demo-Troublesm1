package org.wecancodeit.librarydemo;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.librarydemo.models.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
