package hh.sof03.bookstore;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import hh.sof03.bookstore.web.BookController;
import hh.sof03.bookstore.web.CategoryController;

@ExtendWith(SpringExtension.class) 
@SpringBootTest
public class BookstoreApplicationTests {

	@Autowired
	private BookController bookcontorller;
	@Autowired
	private CategoryController categorycontroller;
	
	@Test
	public void contextLoads() {
		assertThat(bookcontorller).isNotNull();
		assertThat(categorycontroller).isNotNull();
		
	}

}