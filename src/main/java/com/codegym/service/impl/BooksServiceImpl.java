package com.codegym.service.impl;

import com.codegym.model.Books;
import com.codegym.repository.BooksRepository;
import com.codegym.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

public class BooksServiceImpl implements BookService {

    @Autowired
    private BooksRepository booksRepository;

    @Override
    public Iterable<Books> findAll() {
        return booksRepository.findAll();
    }

    @Override
    public Books findById(Integer id) {
        Books books = booksRepository.findOne(id);
        return books;
    }

    @Override
    public Books save(Books books) {
        return booksRepository.save(books);
    }

    @Override
    public Books remove(Integer id) {
        Books books = findById(id);
        booksRepository.delete(id);
        return books;
    }
}
