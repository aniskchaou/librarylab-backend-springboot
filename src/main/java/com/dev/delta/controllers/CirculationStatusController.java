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

import com.dev.delta.entities.CirculationStatus;
import com.dev.delta.services.CirculationStatusService;
@RestController
@RequestMapping("/circulationstatus")
@CrossOrigin
public class CirculationStatusController {
	@Autowired
	CirculationStatusService circulationStatusService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody CirculationStatus projectCirculationStatus, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        CirculationStatus newPT = circulationStatusService.saveOrUpdate(projectCirculationStatus);

	        return new ResponseEntity<CirculationStatus>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<CirculationStatus> getAllCirculationStatuss()
   {
	   return circulationStatusService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<CirculationStatus> getCirculationStatusById(@PathVariable Long id)
   {
	   CirculationStatus circulationStatus=circulationStatusService.findById(id);
	   return new ResponseEntity<CirculationStatus>(circulationStatus,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteCirculationStatus(@PathVariable Long id)
   {
	   circulationStatusService.delete(id);
	   return new ResponseEntity<String>("circulationStatus was deleted",HttpStatus.OK);
   }
}
