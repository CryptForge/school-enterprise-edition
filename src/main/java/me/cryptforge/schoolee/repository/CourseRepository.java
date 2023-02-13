package me.cryptforge.schoolee.repository;

import me.cryptforge.schoolee.model.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface CourseRepository extends CrudRepository<Course, Long> {
}
