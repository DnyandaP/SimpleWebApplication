package com.training.firstwebproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.firstwebproject.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book,Long> {

}
