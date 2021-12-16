package com.dev.delta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import com.dev.delta.entities.Book;
import com.dev.delta.entities.Category;
import com.dev.delta.entities.Publisher;
import com.dev.delta.entities.Writer;
import com.dev.delta.repositories.BookRepository;
import com.dev.delta.services.BookService;

@ExtendWith(MockitoExtension.class)
@DataJpaTest
class BookServiceTest {
/*
	@Autowired
	private BookRepository bookRepository;
	@Autowired
	BookService bookService;
	
	@BeforeEach
    void initUseCase() {
		Book book1 = new Book(1L, "123", "title 1", new Writer(), "", "", "", new Publisher(), "", "", "", "", "",
				new Category());
		bookRepository.save(book1);
    }

	@Test
	public void getAllBooksTest() {
		List<Book> list = new ArrayList<Book>();
		Book book1 = new Book(1L, "123", "title 1", new Writer(), "", "", "", new Publisher(), "", "", "", "", "",
				new Category());
		Book book2 = new Book(1L, "123", "title 1", new Writer(), "", "", "", new Publisher(), "", "", "", "", "",
				new Category());
		Book book3 = new Book(1L, "123", "title 1", new Writer(), "", "", "", new Publisher(), "", "", "", "", "",
				new Category());

		list.add(book1);
		list.add(book2);
		list.add(book3);

		when(bookRepository.findAll()).thenReturn(list);

		// test
		List<Book> bookList = (List<Book>) bookService.findAll();

		assertEquals(3, bookList.size());
		verify(bookRepository, times(1)).findAll();
	}
	

	@Test
	public void getBookByIdTest() {
		
		  when(bookRepository.findById(1L)).thenReturn(Optional.of(new Book(1L, "123",
		"title 1", new Writer(), "", "", "", new Publisher(), "", "", "", "", "", new
		  Category())));
		  
		 Book book = bookService.findById(1L);
		 
		  assertEquals("123", book.getIsbn()); assertEquals("title 1",
		  book.getTitle());
		

	}

	@Test
	public void saveBookTest() {
		Book book1 = new Book(1L, "123", "title 1", new Writer(), "", "", "", new Publisher(), "", "", "", "", "",
				new Category());

		bookService.saveOrUpdate(book1);

		verify(bookRepository, times(1)).save(book1);
	}
   */
}
