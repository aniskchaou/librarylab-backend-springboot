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

import com.dev.delta.entities.Tag;
import com.dev.delta.services.TagService;


@RestController
@RequestMapping("/tag")
@CrossOrigin
public class TagController {
	@Autowired
	TagService tagService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Tag projectTag, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Tag newPT = tagService.saveOrUpdate(projectTag);

	        return new ResponseEntity<Tag>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Tag> getAllTags()
   {
	   return tagService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Tag> getTagById(@PathVariable Long id)
   {
	   Tag tag=tagService.findById(id);
	   return new ResponseEntity<Tag>(tag,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteTag(@PathVariable Long id)
   {
	   tagService.delete(id);
	   return new ResponseEntity<String>("tag was deleted",HttpStatus.OK);
   }
}
