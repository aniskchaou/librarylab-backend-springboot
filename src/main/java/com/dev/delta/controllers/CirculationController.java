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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("circulation")
@CrossOrigin
@Api(value = "BookController", description = " this is the circulation controller class")
/**
 * circulation controller
 * 
 * @author Admin
 *
 */
public class CirculationController {

	/**
	 * circulation service
	 */
	@Autowired
	CirculationService circulationService;

	/**
	 * 
	 * @param projectCirculation
	 * @param result
	 * @return
	 */
	@ApiOperation(value = " add circulation ")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "success"),
			@ApiResponse(code = 404, message = "not found") })
	@PostMapping("/create")
	public ResponseEntity<?> addCirculation(@Validated @RequestBody Circulation projectCirculation,
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

	/**
	 * get circulations
	 * 
	 * @return
	 */
	@ApiOperation(value = " find all circulations ")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "success"),
			@ApiResponse(code = 404, message = "not found") })
	@GetMapping("/all")
	public Iterable<Circulation> getAllCirculations() {
		return circulationService.findAll();
	}

	/**
	 * get circulation
	 * 
	 * @param id
	 * @return
	 * @throws Exception 
	 */
	@ApiOperation(value = " find by id ")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "success"),
			@ApiResponse(code = 404, message = "not found") })
	@GetMapping("/{id}")
	public ResponseEntity<Circulation> getCirculationById(@PathVariable Long id) throws Exception {
		Circulation circulation = circulationService.findById(id);
		return new ResponseEntity<Circulation>(circulation, HttpStatus.OK);
	}

	/**
	 * delete circulation
	 * 
	 * @param id
	 * @return
	 * @throws Exception 
	 */
	@ApiOperation(value = " delete ")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "success"),
			@ApiResponse(code = 404, message = "not found") })
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteCirculation(@PathVariable Long id) throws Exception {
		circulationService.delete(id);
		return new ResponseEntity<String>("circulation was deleted", HttpStatus.OK);
	}
}
