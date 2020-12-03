package com.codegym.controller;

import com.codegym.model.Category;
import com.codegym.service.BookService;
import com.codegym.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/category")
public class CategoryController {

    @Autowired
    private BookService bookService;

    @Autowired
    private CategoryService categoryService;


    @RequestMapping(value = "/creat",method = RequestMethod.GET)
    public ModelAndView showCreatForm(){
        ModelAndView modelAndView = new ModelAndView("/categorys/newCategory");
        modelAndView.addObject("category",new Category());
        return modelAndView;
    }

    @RequestMapping(value = "/newCategory",method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE ,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    // cho controller biet tra ve 1 doi tuong kieu json
    public Category createCategory(@RequestBody Category category){
        return categoryService.save(category);
    }



}
