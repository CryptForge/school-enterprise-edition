package me.cryptforge.schoolee.repository;

import me.cryptforge.schoolee.model.School;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.nio.file.LinkOption;

@Component
public interface SchoolRepository extends CrudRepository<School, LinkOption> {
}
