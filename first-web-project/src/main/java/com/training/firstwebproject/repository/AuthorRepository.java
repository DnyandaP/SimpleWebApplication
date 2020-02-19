package com.training.firstwebproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.firstwebproject.model.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author,Long> {

}
