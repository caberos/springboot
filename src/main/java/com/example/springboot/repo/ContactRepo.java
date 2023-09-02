package com.example.springboot.repo;

import com.example.springboot.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ContactRepo extends JpaRepository<Contact, Long> {
}
