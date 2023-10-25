package hh.sof03.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hh.sof03.bookstore.domain.Book;
import hh.sof03.bookstore.domain.BookRepository;
import hh.sof03.bookstore.domain.Category;
import hh.sof03.bookstore.domain.CategoryRepository;
import hh.sof03.bookstore.domain.User;
import hh.sof03.bookstore.domain.UserRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(BookRepository bookRepo, CategoryRepository catRepo, UserRepository userRepo) {
	return (args) -> {
		
		Category c1 = new Category("fantasy"); 
		Category c2 = new Category("scifi"); 
		Category c3 = new Category("thriller");
		
		catRepo.save(c1);
		catRepo.save(c2);
		catRepo.save(c3);
		
		bookRepo.save(new Book("The Hobbit", "J.R.R. Tolkien", "9780547928241", 1937, 25.0, c1));
		bookRepo.save(new Book("Frankenstein", "Mary Shelley", "9780141393391", 1818, 25.0, c2));
		
		User user1 = new User("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER", "user@mail.com");
		User user2 = new User("admin", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN", "admin@admin.com");
		userRepo.save(user1);
		userRepo.save(user2);
		
		};
	}

}
