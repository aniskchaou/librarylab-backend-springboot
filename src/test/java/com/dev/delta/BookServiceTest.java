package com.dev.delta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.dev.delta.entities.Book;
import com.dev.delta.entities.Category;
import com.dev.delta.entities.Publisher;
import com.dev.delta.entities.Writer;
import com.dev.delta.repositories.BookRepository;
import com.dev.delta.services.BookService;

@SpringBootTest
class BookServiceTest {

	@InjectMocks
	BookService bookService;

	@Mock
	BookRepository bookRepository;

	List<Category> list;

	@BeforeEach
	public void init() {
		MockitoAnnotations.openMocks(this);
		list = new ArrayList<Category>();
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
   
}
