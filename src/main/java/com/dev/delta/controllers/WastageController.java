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

import com.dev.delta.entities.Wastage;
import com.dev.delta.services.WastageService;

@RestController
@RequestMapping("/wastage")
@CrossOrigin
public class WastageController {
	@Autowired
	WastageService wastageService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Wastage projectWastage, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Wastage newPT = wastageService.saveOrUpdate(projectWastage);

	        return new ResponseEntity<Wastage>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Wastage> getAllWastages()
   {
	   return wastageService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Wastage> getWastageById(@PathVariable Long id)
   {
	   Wastage wastage=wastageService.findById(id);
	   return new ResponseEntity<Wastage>(wastage,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteWastage(@PathVariable Long id)
   {
	   wastageService.delete(id);
	   return new ResponseEntity<String>("wastage was deleted",HttpStatus.OK);
   }
}
