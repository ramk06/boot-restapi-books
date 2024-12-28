package com.api.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.entities.Book;
import com.api.book.services.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	// get all books handler
	@GetMapping("/books")
	public List<Book> getBooks() {
		return this.bookService.getAllBooks();
	}
	
	// get single book handlet
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id") int id) {
		return bookService.getBookById(id);
	}
	
	// new book handler
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book) {
		return this.bookService.addBook(book);
		
	}
	
	@DeleteMapping("/books/{id}")
	public void deleteBook(@PathVariable("id") int id)
	{
		this.bookService.deleteBook(id);
	}
	
}
