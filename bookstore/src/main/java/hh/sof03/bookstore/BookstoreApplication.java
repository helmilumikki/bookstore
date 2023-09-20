package hh.sof03.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hh.sof03.bookstore.domain.Book;
import hh.sof03.bookstore.domain.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(BookRepository repository) {
	return (args) -> {
		Book b1 = new Book("The Hobbit", "J.R.R. Tolkien", "9780547928241", 1937, 25.0);
		Book b2 = new Book("Frankenstein", "Mary Shelley", "9780141393391", 1818, 25.0);
		
		repository.save(b1);
		repository.save(b2);
		};
	}

}
