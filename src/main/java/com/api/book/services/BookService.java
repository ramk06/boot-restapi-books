package com.api.book.services;

import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.book.dao.BookRepository;
import com.api.book.entities.Book;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;

//	private static List<Book> list = new ArrayList<>();
//
//	static {
//		list.add(new Book(02,"Java Complete Reference","xyz"));
//		list.add(new Book(03,"Javascript Complete Reference","xyz"));
//		list.add(new Book(04,"Python Complete Reference","xyz"));
//		list.add(new Book(05,"Go Complete Reference","xyz"));
//		list.add(new Book(06,"C++ Complete Reference","xyz"));
//	}

	// get all books

	public List<Book> getAllBooks() {
		List<Book> list = (List<Book>) this.bookRepository.findAll();
		return list;
	}

	// get single book by id

	// By stream API

//	public Book getBookById(int id) {
//		Book book = null;
//		list.stream().filter(e ->e.getId()==id).findFirst().get();
//		return book;
//	}

//	public Book getBookById(int id) {
//		Book book = null;
//		ListIterator<Book> iterator = list.listIterator();
//		while (iterator.hasNext()) {
//			Book currentBook = iterator.next();
//			if (currentBook.getId() == id) {
//				book = currentBook;
//				break;
//			}
//		}
//		return book;
//	}
	
	
	public Book getBookById(int id) {
		Book book = null;
		try {
			book = this.bookRepository.findById(id);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return book;
	}

	// adding the book
//	public Book addBook(Book b) {
//		list.add(b);
//		return b;
//	}
	
	public Book addBook(Book b) {
		 Book result = bookRepository.save(b);
		return result;
	}

	// delete book
//	public void deleteBook(int id) 
//	{
//		list.stream().filter(book -> {
//			if(book.getId()!=id) {
//				return true;
//			}else {
//				return false;
//			}
//		}).collect(Collectors.toList());
//	}

//	public void deleteBook(int id) {
//		ListIterator<Book> iterator = list.listIterator();
//		while (iterator.hasNext()) {
//			Book book = iterator.next();
//			if (book.getId() == id) {
//				iterator.remove(); // Remove the book from the list
//				break; // Exit the loop after removing the book
//			}
//		}
//	}
//	
	public void deleteBook(int id) {
		bookRepository.deleteById(id);
	}

	
	
	
	
	

	// Update the book
//	public void updateBook(Book book,int id) 
//	{
//		list = list.stream().map(b->{
//			if(b.getId()==id) {
//				b.setTitle(book.getTitle());
//				b.setAuthor(book.getAuthor());
//			}
//			return b;
//		}).collect(Collectors.toList());
//		
//	}

//	public void updateBook(Book book, int id) {
//		ListIterator<Book> iterator = list.listIterator();
//		while (iterator.hasNext()) {
//			Book b = iterator.next();
//			if (b.getId() == id) {
//				b.setTitle(book.getTitle());
//				b.setAuthor(book.getAuthor());
//				break;
//			}
//		}
//	}
	
	
	public void updateBook(Book book, int id) {
		book.setId(id);
		bookRepository.save(book);
	}

}
