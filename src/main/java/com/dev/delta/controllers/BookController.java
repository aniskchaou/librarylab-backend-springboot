package com.dev.delta.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.delta.entities.Book;
import com.dev.delta.services.BookService;

@RestController
@RequestMapping("/book")
@CrossOrigin
public class BookController {
	@Autowired
	BookService bookService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Book projectBook, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Book newPT = bookService.saveOrUpdate(projectBook);

	        return new ResponseEntity<Book>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Book> getAllBooks()
   {
	   return bookService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Book> getBookById(@PathVariable Long id)
   {
	   Book book=bookService.findById(id);
	   return new ResponseEntity<Book>(book,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteBook(@PathVariable Long id)
   {
	   bookService.delete(id);
	   return new ResponseEntity<String>("book was deleted",HttpStatus.OK);
   }
}
