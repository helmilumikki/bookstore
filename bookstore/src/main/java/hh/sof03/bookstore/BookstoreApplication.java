package hh.sof03.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hh.sof03.bookstore.domain.Book;
import hh.sof03.bookstore.domain.BookRepository;
import hh.sof03.bookstore.domain.Category;
import hh.sof03.bookstore.domain.CategoryRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(BookRepository bookRepo, CategoryRepository catRepo) {
	return (args) -> {
		
		catRepo.save(new Category("fantasy"));
		catRepo.save(new Category("scifi"));
		catRepo.save(new Category("thriller"));
		
		bookRepo.save(new Book("The Hobbit", "J.R.R. Tolkien", "9780547928241", 1937, 25.0));
		bookRepo.save(new Book("Frankenstein", "Mary Shelley", "9780141393391", 1818, 25.0));
		};
	}

}
