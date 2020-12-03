package com.codegym.repository;

import com.codegym.model.Books;
import org.springframework.data.repository.CrudRepository;

public interface BooksRepository extends CrudRepository <Books,Integer>{
}
