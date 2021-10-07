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

import com.dev.delta.entities.Archive;
import com.dev.delta.services.ArchiveService;
@RestController
@RequestMapping("/archive")
@CrossOrigin
public class ArchiveController {
	@Autowired
	ArchiveService archiveService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Archive projectArchive, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Archive newPT = archiveService.saveOrUpdate(projectArchive);

	        return new ResponseEntity<Archive>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Archive> getAllArchives()
   {
	   return archiveService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Archive> getArchiveById(@PathVariable Long id)
   {
	   Archive archive=archiveService.findById(id);
	   return new ResponseEntity<Archive>(archive,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteArchive(@PathVariable Long id)
   {
	   archiveService.delete(id);
	   return new ResponseEntity<String>("archive was deleted",HttpStatus.OK);
   }
}
