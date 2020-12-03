package com.codegym.model;


import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String author;
    private double price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Books() {
    }

    public Books(String name, String author, double price, Category category) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return String.format("Books[id=%d, name='%s', author='%s' , Price='%s']", id, name, author,price);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
