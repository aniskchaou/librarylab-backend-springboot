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

import com.dev.delta.entities.Category;
import com.dev.delta.services.CategoryBookService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("category")
@CrossOrigin
@Api(value = "BookController", description = " this is the category book controller class")
/**
 * Category Controller
 * 
 * @author Admin
 *
 */
public class CategoryBookController {
	/**
	 * CategoryBookService
	 */
	@Autowired
	CategoryBookService categoryService;

	/**
	 * addCategory
	 * 
	 * @param projectCategory
	 * @param result
	 * @return
	 */
	@ApiOperation(value = " add category ")
	@PostMapping("/create")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "success"),
			@ApiResponse(code = 404, message = "not found") })
	public ResponseEntity<?> addCategory(@Validated @RequestBody Category projectCategory, BindingResult result) {

		if (result.hasErrors()) {
			Map<String, String> errorMap = new HashMap<String, String>();

			for (FieldError error : result.getFieldErrors()) {
				errorMap.put(error.getField(), error.getDefaultMessage());
			}
			return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
		}

		Category newPT = categoryService.saveOrUpdate(projectCategory);

		return new ResponseEntity<Category>(newPT, HttpStatus.CREATED);
	}

	/**
	 * getAllCategorys
	 * 
	 * @return
	 */
	@ApiOperation(value = " find categories ")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "success"),
			@ApiResponse(code = 404, message = "not found") })
	@GetMapping("/all")
	public Iterable<Category> getAllCategorys() {
		return categoryService.findAll();
	}

	/**
	 * getCategoryById
	 * 
	 * @param id
	 * @return
	 */
	@ApiOperation(value = " get category by id ")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "success"),
			@ApiResponse(code = 404, message = "not found") })
	@GetMapping("/{id}")
	public ResponseEntity<Category> getCategoryById(@PathVariable Long id) {
		Category category = categoryService.findById(id);
		return new ResponseEntity<Category>(category, HttpStatus.OK);
	}

	/**
	 * deleteCategory
	 * 
	 * @param id
	 * @return
	 */
	@ApiOperation(value = " rdelete by id ")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "success"),
			@ApiResponse(code = 404, message = "not found") })
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteCategory(@PathVariable Long id) {
		categoryService.delete(id);
		return new ResponseEntity<String>("category was deleted", HttpStatus.OK);
	}

}
