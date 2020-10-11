package com.teresol.taskmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teresol.taskmanager.entity.Team;
import com.teresol.taskmanager.repository.TeamRepo;

@RestController
@CrossOrigin
@RequestMapping("/team")
public class TeamController {

	
	@Autowired TeamRepo tRepo;
	@GetMapping("/tgid/{tgid}")
	public ResponseEntity<Object> getTeamByTeamGroup(@PathVariable("tgid") int tgid){
		
		List<Team> teams = tRepo.findTeamByTeamGroupId(tgid); 
		return new ResponseEntity<Object>(teams,HttpStatus.OK);
	}
	
	
	@GetMapping("/")
	public ResponseEntity<Object> getAllTeam(){
		List<Team> teams   = tRepo.findAll();
		return new ResponseEntity<Object>(teams,HttpStatus.OK);
	}
	
	
}
