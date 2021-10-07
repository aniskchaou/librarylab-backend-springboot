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

import com.dev.delta.entities.Member;
import com.dev.delta.services.MemberService;

@RestController
@RequestMapping("/member")
@CrossOrigin
public class MemberController {
	@Autowired
	MemberService memberService;
	
	
	@PostMapping("/create")
	 public ResponseEntity<?> addPTToBoard(@Validated @RequestBody Member projectMember, BindingResult result){

	    if(result.hasErrors()){
	            Map<String, String> errorMap = new HashMap<String,String>();

	            for(FieldError error: result.getFieldErrors()){
	                errorMap.put(error.getField(), error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
	        }
          
	        Member newPT = memberService.saveOrUpdate(projectMember);

	        return new ResponseEntity<Member>(newPT, HttpStatus.CREATED);
	    }
	
	
	
   @GetMapping("/all")
   public Iterable<Member> getAllMembers()
   {
	   return memberService.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Member> getMemberById(@PathVariable Long id)
   {
	   Member member=memberService.findById(id);
	   return new ResponseEntity<Member>(member,HttpStatus.OK);
   }
   
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteMember(@PathVariable Long id)
   {
	   memberService.delete(id);
	   return new ResponseEntity<String>("member was deleted",HttpStatus.OK);
   }
}
