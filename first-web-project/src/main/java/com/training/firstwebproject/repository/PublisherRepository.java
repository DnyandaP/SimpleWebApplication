package com.training.firstwebproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.firstwebproject.model.Publisher;

@Repository
public interface PublisherRepository extends CrudRepository<Publisher,Long> {

}
