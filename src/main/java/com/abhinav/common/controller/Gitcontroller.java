package com.abhinav.common.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/gitsearch")
public class Gitcontroller {
	
	@Autowired
	GitService gitservice;
	
	@RequestMapping("/repo")
	public ResponseEntity<List<GitModel>> getallrepo(){
		List<GitModel> repolist1 = gitservice.getallrepo();
		System.out.println("hello");
		return new ResponseEntity<List<GitModel>>(repolist1, HttpStatus.OK);
			
		
	}
	@RequestMapping(value="/add", method=RequestMethod.POST	,consumes= {"application/json", MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<String> addrepo(@RequestBody GitModel gitmodel) {
		
		gitservice.addrepo(gitmodel);
		
		return new ResponseEntity<String> ("new repo added", HttpStatus.OK);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="delete/{id}")
	public void deleterepo(@PathVariable("id") String id) {
		gitservice.delete(id);
		
		System.out.println("inside delete method");
		 
		
	}
	
}
	
	
