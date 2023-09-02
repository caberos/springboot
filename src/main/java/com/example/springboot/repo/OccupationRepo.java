package com.example.springboot.repo;

import com.example.springboot.models.Occupation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OccupationRepo extends JpaRepository<Occupation, Long> {
}