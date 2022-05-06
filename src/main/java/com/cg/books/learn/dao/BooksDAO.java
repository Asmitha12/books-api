package com.cg.books.learn.dao;

import org.springframework.data.repository.CrudRepository;

import com.cg.books.learn.model.Books;

public interface BooksDAO extends CrudRepository <Books, Integer>{

}
