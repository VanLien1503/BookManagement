package com.codegym.service.impl;

import com.codegym.model.Books;
import com.codegym.model.Category;
import com.codegym.repository.BooksRepository;
import com.codegym.repository.CategoryRepository;
import com.codegym.service.BookService;
import com.codegym.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class BooksServiceImpl implements BookService {

    @Autowired
    private BooksRepository booksRepository;


    @Override
    public Page<Books> findAll(Pageable pageable) {
        return booksRepository.findAll(pageable);
    }

    //    @Override
//    public Iterable<Books> findAll() {
//        return booksRepository.findAll();
//    }
//
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

    public static class CategoryServiceImpl implements CategoryService {
        @Autowired
        private CategoryRepository categoryRepository;

        @Override
        public Iterable<Category> findAll() {
            return categoryRepository.findAll();
        }

        @Override
        public Category findById(Integer id) {
            Category category = categoryRepository.findOne(id);
            return category;
        }

        @Override
        public Category save(Category category) {
            return categoryRepository.save(category);
        }

        @Override
        public Category remove(Integer id) {
            Category category = findById(id);
            categoryRepository.delete(id);
            return category;
        }

    }
}
