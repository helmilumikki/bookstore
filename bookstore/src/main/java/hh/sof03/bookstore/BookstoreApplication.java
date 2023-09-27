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
		
		Category c1 = new Category("fantasy"); 
		Category c2 = new Category("scifi"); 
		Category c3 = new Category("thriller");
		
		catRepo.save(c1);
		catRepo.save(c2);
		catRepo.save(c3);
		
		bookRepo.save(new Book("The Hobbit", "J.R.R. Tolkien", "9780547928241", 1937, 25.0, c1));
		bookRepo.save(new Book("Frankenstein", "Mary Shelley", "9780141393391", 1818, 25.0, c2));
		};
	}

}
