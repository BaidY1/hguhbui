package com.teresol.taskmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teresol.taskmanager.entity.Packages;
import com.teresol.taskmanager.entity.TeamGroup;
import com.teresol.taskmanager.repository.PackagesRepo;
import com.teresol.taskmanager.repository.TeamGroupRepo;

@RestController
@CrossOrigin
@RequestMapping(value = "/assignPkg/")
public class AssignPacakgesController {
	
	@Autowired PackagesRepo pkRepo;
	@Autowired TeamGroupRepo tgRepo;
	
	@PutMapping(value = "/pgid/{pgid}/pid/{pid}/tgid/{tgid}")
	public ResponseEntity<Object> assignPackageToTeamGroup(@PathVariable("pgid") int pgid,@PathVariable("pid")
	int pid,@PathVariable("tgid") int tgid){
		System.out.println("LOG | assignPackageToTeamGroup");
		Packages packages = pkRepo.getUnAssignedPackageByGroupIdAndPackageId(pgid, pid);
		TeamGroup teamGroup = tgRepo.findById(tgid).orElse(null);
		if(teamGroup!=null) {
			packages.setAssignedTeamGroup(teamGroup);
			pkRepo.save(packages);
			return new ResponseEntity<Object> ("Package Assigned",HttpStatus.OK);
		}
		
		return new ResponseEntity<Object> ("Package can't be Assigned",HttpStatus.OK);
		
	}
}
