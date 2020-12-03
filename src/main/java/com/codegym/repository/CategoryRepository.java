package com.codegym.repository;

import com.codegym.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Integer> {
    Category findAllByNameCategory(String name);
}
