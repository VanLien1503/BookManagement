package com.codegym.service;

import com.codegym.model.Category;

public interface CategoryService {
    Iterable<Category>findAll();
    Category findById (Integer id);
    Category save (Category category);
    Category remove(Integer id);
    Category findAllByNameCategory(String name);
}
