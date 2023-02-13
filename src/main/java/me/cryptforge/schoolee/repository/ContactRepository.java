package me.cryptforge.schoolee.repository;

import me.cryptforge.schoolee.model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface ContactRepository extends CrudRepository<Contact, Long> {
}
