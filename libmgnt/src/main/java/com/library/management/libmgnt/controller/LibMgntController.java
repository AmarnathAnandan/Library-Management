package com.library.management.libmgnt.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.library.management.libmgnt.model.Book;
import com.library.management.libmgnt.service.BooksService;

@RestController
public class LibMgntController {
	@Autowired
	BooksService booksService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "Welcome to Library Management service";
	}

	@RequestMapping(value = "/sample", method = RequestMethod.GET)
	public String addSample() {
		Book book = new Book();
		book.setBookId(1001);
		book.setBookAuthor("Dennis Litchie");
		book.setBookLocation("2B2C11");
		book.setBookName("CS Pgmng");
		book.setBookPrice((double) 52.63);
		book.setIsAvailable(true);
		Date date = (Date) Calendar.getInstance().getTime();
		book.setPublisedDate(date);
		booksService.saveOrUpdate(book);
		return "Added successfully";
	}

	@RequestMapping(value = "/library-management/login", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		return "login";
	}
	
	@RequestMapping(value = "/library-management/show-all-books", method = RequestMethod.GET)
	private List<Book> getAllBooks() {
		return booksService.getAllBooks();
	}

	// creating a get mapping that retrieves the detail of a specific book
	@GetMapping("/library-management/show-book/{bookid}")
	private Book getBooks(@PathVariable("bookid") int bookid) {
		return booksService.getBooksById(bookid);
	}

	// creating a delete mapping that deletes a specified book
	@DeleteMapping("/library-management/delete-book/{bookid}")
	private void deleteBook(@PathVariable("bookid") int bookid) {
		booksService.delete(bookid);
	}

	// creating post mapping that post the book detail in the database
	@PostMapping("/library-management/add-book")
	private int saveBook(@RequestBody Book books) {
		booksService.saveOrUpdate(books);
		return books.getBookId();
	}

	// creating put mapping that updates the book detail
	@PutMapping("/library-management/update-book")
	private Book update(@RequestBody Book books) {
		booksService.saveOrUpdate(books);
		return books;
	}
}