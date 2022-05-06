package com.cg.books.learn.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.books.learn.dao.BooksDAO;
import com.cg.books.learn.model.Books;

@RestController
public class BooksController {

	@Autowired
	private BooksDAO dao;
	
	@GetMapping("/books")
	public List<Books> getBooks(){
		return (List<Books>) dao.findAll();
	}
	
	@GetMapping("/books/{id}")
	public Books get(@PathVariable int id) {
		Optional<Books> books = dao.findById(id);
		if(books.isPresent()) {
			return books.get();
		}else {
			throw new RuntimeException("Book with id no "+id+" not found");
		}
	}
	
	@PostMapping("/books")
	public String addBooks(@RequestBody List<Books> books) {
		dao.saveAll(books);
		return "Book successfully added." +books.size();
	}
	
	@DeleteMapping("/books/{id}")
	public String delete(@PathVariable int id) {
		Optional<Books> books = dao.findById(id);
		if(books.isPresent()) {
			dao.delete(books.get());
			return "book is deleted with id" +id;
		}else {
			throw new RuntimeException("Book with id no "+id+" not found");
		}
	}
}
