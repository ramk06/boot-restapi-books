package com.api.book.services;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.api.book.entities.Book;

@Service
public class BookService {
	
	private static List<Book> list = new ArrayList<>();
	
	static {
		list.add(new Book(02,"Java Complete Reference","xyz"));
		list.add(new Book(03,"Javascript Complete Reference","xyz"));
		list.add(new Book(04,"Python Complete Reference","xyz"));
		list.add(new Book(05,"Go Complete Reference","xyz"));
		list.add(new Book(06,"C++ Complete Reference","xyz"));
	}
	
	// get all books
	
	public List<Book> getAllBooks(){
		return list;
	}
	
	// get single book by id
	
	//By stream API

//	public Book getBookById(int id) {
//		Book book = null;
//		list.stream().filter(e ->e.getId()==id).findFirst().get();
//		return book;
//	}
	
	
	public Book getBookById(int id) {
	    Book book = null;
	    ListIterator<Book> iterator = list.listIterator();
	    while (iterator.hasNext()) {
	        Book currentBook = iterator.next();
	        if (currentBook.getId() == id) {
	            book = currentBook;
	            break;
	        }
	    }
	    return book;
	}

}
