package org.wecancodeit.librarydemo;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.librarydemo.models.Campus;

public interface CampusRepository extends CrudRepository<Campus, Long> {

}
