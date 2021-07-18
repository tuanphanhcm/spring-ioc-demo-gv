package cybersoft.java12.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cybersoft.java12.springdemo.model.Book;
import cybersoft.java12.springdemo.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	
	private BookService service;
	
	@Autowired
	private Book book;
	
	public void setBookService(@Autowired BookService bookService) {
		service = bookService;
	}
	
	public BookController(BookService bookService) {
		service = bookService;
	}
	
	@GetMapping("s")
	public Object getBooks() {
		return service.getBooks();
	}
	
	@GetMapping("")
	public Object getBook() {
		return this.book;
	}
}
