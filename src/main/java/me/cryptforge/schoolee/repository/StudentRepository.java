package me.cryptforge.schoolee.repository;

import me.cryptforge.schoolee.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface StudentRepository extends CrudRepository<Student, Long> {
}
