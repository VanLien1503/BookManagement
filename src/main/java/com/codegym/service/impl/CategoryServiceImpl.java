package com.codegym.service.impl;

import com.codegym.model.Category;
import com.codegym.repository.CategoryRepository;
import com.codegym.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryServiceImpl implements CategoryService {
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

    @Override
    public Category findAllByNameCategory(String name) {
        return categoryRepository.findAllByNameCategory(name);
    }
}
