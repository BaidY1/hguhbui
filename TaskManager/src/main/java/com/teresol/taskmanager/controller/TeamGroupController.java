package com.teresol.taskmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.teresol.taskmanager.entity.TeamGroup;
import com.teresol.taskmanager.repository.TeamGroupRepo;
import com.teresol.taskmanager.services.TeamGroupServices;

@RestController
@CrossOrigin
public class TeamGroupController {
	
	@Autowired 
	TeamGroupServices tgServices;
	
	
	@Autowired TeamGroupRepo tgRepo;
	
	
	
	@GetMapping(value = "/teamgroup/{id}")
	public ResponseEntity<Object> findTeamGroupById(@PathVariable("id") int id) {
		TeamGroup tg = tgServices.getTeamGroupById(id);
		if(tg!=null) {
			return new ResponseEntity<Object>(tg,HttpStatus.OK);
		}
		return new ResponseEntity<Object>("Team Group not found",HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping(value = "/teamgroup/")
	public ResponseEntity<Object> gettAllTeamGroup(){
		List<TeamGroup> result = tgRepo.findAll();
		return new ResponseEntity<Object>(result,HttpStatus.OK);
	}

}
