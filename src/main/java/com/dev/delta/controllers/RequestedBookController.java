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

import com.dev.delta.entities.RequestedBook;
import com.dev.delta.services.RequestedBookService;

@RestController
@RequestMapping("requestedbook")
@CrossOrigin
public class RequestedBookController {
	@Autowired
	RequestedBookService requestedBookService;

	@PostMapping("/create")
	public ResponseEntity<?> addPTToBoard(@Validated @RequestBody RequestedBook projectRequestedBook,
			BindingResult result) {

		if (result.hasErrors()) {
			Map<String, String> errorMap = new HashMap<String, String>();

			for (FieldError error : result.getFieldErrors()) {
				errorMap.put(error.getField(), error.getDefaultMessage());
			}
			return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
		}

		RequestedBook newPT = requestedBookService.saveOrUpdate(projectRequestedBook);

		return new ResponseEntity<RequestedBook>(newPT, HttpStatus.CREATED);
	}

	@GetMapping("/all")
	public Iterable<RequestedBook> getAllRequestedBooks() {
		return requestedBookService.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<RequestedBook> getRequestedBookById(@PathVariable Long id) {
		RequestedBook requestedBook = requestedBookService.findById(id);
		return new ResponseEntity<RequestedBook>(requestedBook, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteRequestedBook(@PathVariable Long id) {
		requestedBookService.delete(id);
		return new ResponseEntity<String>("requestedBook was deleted", HttpStatus.OK);
	}
}
