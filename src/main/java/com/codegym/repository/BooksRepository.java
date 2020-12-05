package com.codegym.repository;

import com.codegym.model.Books;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BooksRepository extends PagingAndSortingRepository<Books,Integer> {
}
