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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.delta.entities.Settings;
import com.dev.delta.services.SettingsService;

@RestController
@RequestMapping("settings")
@CrossOrigin
public class SettingsController {
	@Autowired
	SettingsService settingsService;

	@PostMapping("/create")
	public ResponseEntity<?> addSettings(@Validated @RequestBody Settings settings, BindingResult result) {

		if (result.hasErrors()) {
			Map<String, String> errorMap = new HashMap<String, String>();

			for (FieldError error : result.getFieldErrors()) {
				errorMap.put(error.getField(), error.getDefaultMessage());
			}
			return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
		}

		Settings newPT = settingsService.saveOrUpdate(settings);

		return new ResponseEntity<Settings>(newPT, HttpStatus.CREATED);
	}

	@GetMapping("/all")
	public Iterable<Settings> getAllSettings() {
		return settingsService.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Settings> getSettingsById(@PathVariable Long id) {
		Settings settings = settingsService.findById(id);
		return new ResponseEntity<Settings>(settings, HttpStatus.OK);
	}

}
