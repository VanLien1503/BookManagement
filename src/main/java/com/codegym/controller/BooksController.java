package com.codegym.controller;

import com.codegym.model.Books;
import com.codegym.model.Category;
import com.codegym.service.BookService;
import com.codegym.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/books")
public class BooksController {
    @Autowired
    private BookService bookService;
    @Autowired
    private CategoryService categoryService;


    @ModelAttribute("categorys")
    public Iterable<Category> category(){
        return categoryService.findAll();
    }

    @RequestMapping(value = "/creat",method = RequestMethod.GET)
    public ModelAndView createBookPage(){
        ModelAndView modelAndView = new ModelAndView("/books/newBook");
        modelAndView.addObject("books",new Books());
        return modelAndView;
    }
    @RequestMapping(value = "/creatNewBook",method = RequestMethod.POST,
    produces = MediaType.APPLICATION_JSON_VALUE,
    consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Books creatBook(@RequestBody Books books){
//        Category category = categoryService.findById(Integer.valueOf(books.getCategory().getNameCategory()));
//        books.setCategory(category);
        return bookService.save(books);
    }


    // hiển thị sanh sách book
    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Iterable<Books> allBooks(){
        return bookService.findAll();
    }

    @GetMapping("")
    public ModelAndView allBookPage() {
        ModelAndView modelAndView = new ModelAndView("books/allBooks");

        modelAndView.addObject("allBooks", allBooks());
        return modelAndView;
    }}
