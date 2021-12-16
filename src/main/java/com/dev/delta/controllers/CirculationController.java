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

import com.dev.delta.entities.Circulation;
import com.dev.delta.services.CirculationService;

@RestController
@RequestMapping("circulation")
@CrossOrigin
public class CirculationController {
	@Autowired
	CirculationService circulationService;

	@PostMapping("/create")
	public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Circulation projectCirculation,
			BindingResult result) {

		if (result.hasErrors()) {
			Map<String, String> errorMap = new HashMap<String, String>();

			for (FieldError error : result.getFieldErrors()) {
				errorMap.put(error.getField(), error.getDefaultMessage());
			}
			return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
		}

		Circulation newPT = circulationService.saveOrUpdate(projectCirculation);

		return new ResponseEntity<Circulation>(newPT, HttpStatus.CREATED);
	}

	@GetMapping("/all")
	public Iterable<Circulation> getAllCirculations() {
		return circulationService.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Circulation> getCirculationById(@PathVariable Long id) {
		Circulation circulation = circulationService.findById(id);
		return new ResponseEntity<Circulation>(circulation, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteCirculation(@PathVariable Long id) {
		circulationService.delete(id);
		return new ResponseEntity<String>("circulation was deleted", HttpStatus.OK);
	}
}
