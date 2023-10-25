package hh.sof03.bookstore.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import hh.sof03.bookstore.domain.Book;
import hh.sof03.bookstore.domain.BookRepository;

@CrossOrigin
@Controller
public class BookRestController {
	
	@Autowired
	private BookRepository bookRepo;

	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public @ResponseBody List<Book> booklistRest() {
		return (List<Book>) bookRepo.findAll();
	}
	
	@RequestMapping(value = "/books/{id}", method = RequestMethod.GET)
	public @ResponseBody Optional<Book> findBookRest (@PathVariable("id") Long bookId) {
		return bookRepo.findById(bookId);
	}
}
