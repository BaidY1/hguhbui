package com.teresol.taskmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teresol.taskmanager.entity.PackagesGroup;
import com.teresol.taskmanager.repository.PackagesGroupRepo;

@RestController
@CrossOrigin
@RequestMapping(value = "/packageGroup")
public class PackageGroupController {

	
	@Autowired
	PackagesGroupRepo pgRepo;
	
	@GetMapping(value = "/")
	public ResponseEntity<Object> getAllPackagesGrop(){
		System.out.println("HERE");
		List<PackagesGroup> result =  pgRepo.findAll();
		
		if(result != null) {
			return new ResponseEntity<Object> (result,HttpStatus.OK);
		}
		return new ResponseEntity<Object>(result,HttpStatus.NOT_FOUND);
	}
	
}
