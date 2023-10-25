package hh.sof03.bookstore;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import hh.sof03.bookstore.domain.Book;
import hh.sof03.bookstore.domain.BookRepository;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class RepositoryTests {
	
	@Autowired
	private BookRepository bookRepo;
	
	
	@Test
	public void createNewBook() {
		Book book = new Book("The Hunger Games", "Suzanne Collins", "11", 2012, 20, null);
		bookRepo.save(book);
		assertThat(book.getId()).isNotNull();
	}
	
	
	

}
