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

import com.dev.delta.entities.Publisher;
import com.dev.delta.services.PublisherService;

@RestController
@RequestMapping("publisher")
@CrossOrigin
public class PublisherController {
	@Autowired
	PublisherService publisherService;

	@PostMapping("/create")
	public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Publisher projectPublisher, BindingResult result) {

		if (result.hasErrors()) {
			Map<String, String> errorMap = new HashMap<String, String>();

			for (FieldError error : result.getFieldErrors()) {
				errorMap.put(error.getField(), error.getDefaultMessage());
			}
			return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
		}

		Publisher newPT = publisherService.saveOrUpdate(projectPublisher);

		return new ResponseEntity<Publisher>(newPT, HttpStatus.CREATED);
	}

	@GetMapping("/all")
	public Iterable<Publisher> getAllPublishers() {
		return publisherService.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Publisher> getPublisherById(@PathVariable Long id) {
		Publisher publisher = publisherService.findById(id);
		return new ResponseEntity<Publisher>(publisher, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deletePublisher(@PathVariable Long id) {
		publisherService.delete(id);
		return new ResponseEntity<String>("publisher was deleted", HttpStatus.OK);
	}
}
