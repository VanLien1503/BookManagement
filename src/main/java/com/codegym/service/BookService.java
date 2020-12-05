package com.codegym.service;

import com.codegym.model.Books;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BookService {
//    Iterable<Books> findAll();
    Page<Books> findAll(Pageable pageable);
    Books findById(Integer id);
    Books save(Books books);
    Books remove(Integer id);
}
