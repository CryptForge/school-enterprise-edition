package me.cryptforge.schoolee.service;

import jakarta.transaction.Transactional;
import me.cryptforge.schoolee.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CourseService {

    @Autowired
    CourseRepository repository;

}
