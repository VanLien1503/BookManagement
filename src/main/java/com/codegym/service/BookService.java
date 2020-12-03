package com.codegym.service;

import com.codegym.model.Books;

public interface BookService {
    Iterable<Books> findAll();
    Books findById(Integer id);
    Books save(Books books);
    Books remove(Integer id);
}
