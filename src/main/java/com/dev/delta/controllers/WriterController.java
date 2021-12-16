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

import com.dev.delta.entities.Writer;
import com.dev.delta.services.WriterService;

@RestController
@RequestMapping("writer")
@CrossOrigin
public class WriterController {
	@Autowired
	WriterService writerService;

	@PostMapping("/create")
	public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Writer projectWriter, BindingResult result) {

		if (result.hasErrors()) {
			Map<String, String> errorMap = new HashMap<String, String>();

			for (FieldError error : result.getFieldErrors()) {
				errorMap.put(error.getField(), error.getDefaultMessage());
			}
			return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
		}

		Writer newPT = writerService.saveOrUpdate(projectWriter);

		return new ResponseEntity<Writer>(newPT, HttpStatus.CREATED);
	}

	@GetMapping("/all")
	public Iterable<Writer> getAllWriters() {
		return writerService.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Writer> getWriterById(@PathVariable Long id) {
		Writer writer = writerService.findById(id);
		return new ResponseEntity<Writer>(writer, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteWriter(@PathVariable Long id) {
		writerService.delete(id);
		return new ResponseEntity<String>("writer was deleted", HttpStatus.OK);
	}
}
