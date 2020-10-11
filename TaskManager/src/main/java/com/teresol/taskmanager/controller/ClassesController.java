package com.teresol.taskmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teresol.taskmanager.entity.Classes;
import com.teresol.taskmanager.entity.Team;
import com.teresol.taskmanager.repository.ClassesRepo;
import com.teresol.taskmanager.repository.TeamRepo;

@RequestMapping("/classes")
@CrossOrigin
@RestController
public class ClassesController {

	
	@Autowired ClassesRepo cRepo;
	
	@Autowired TeamRepo tRepo;
	
	//return unassigned classes in a package
	@GetMapping("/pid/{pid}/unassigned")
	public ResponseEntity<Object> getUnAssigendClassesInPackage(@PathVariable("pid") int pid){
		List<Classes>  result = cRepo.findAllUnAssignedPackageById(pid);
		return new ResponseEntity<Object>(result,HttpStatus.OK);
	}
	
	@GetMapping("/tid/{tid}/assigned")
	public ResponseEntity<Object> getAssignedClasses(@PathVariable("tid") int tid){
		List<Classes> result = cRepo.findAllAssignedClassesByTid(tid);
		return new ResponseEntity<Object>(result,HttpStatus.OK);
	}
	
	
	//assign class to a team
	@PutMapping("/assign/cid/{cid}/tid/{tid}")
	public ResponseEntity<Object> assignClassToTeam(@PathVariable("cid") int cid, @PathVariable("tid") int tid){
		Team team = tRepo.findById(tid).orElse(null);
		if(team != null) {
			Classes _class = cRepo.findById(cid).orElse(null);
			if(_class != null) {
				_class.setAssignedTeam(team);
				Classes temp = cRepo.save(_class);
				return new ResponseEntity<Object>(temp,HttpStatus.OK);
			}
		}
		return new ResponseEntity<Object>("Can't assigned",HttpStatus.OK);
	}
	
	
}
