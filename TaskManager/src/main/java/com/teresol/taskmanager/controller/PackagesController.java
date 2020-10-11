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

import com.teresol.taskmanager.entity.Packages;
import com.teresol.taskmanager.repository.PackagesRepo;
import com.teresol.taskmanager.services.QueryServices;

@RestController
@CrossOrigin
@RequestMapping(value = "/packages")
public class PackagesController {
	
	@Autowired QueryServices queryServices;
	@Autowired PackagesRepo pkgRepo;
	
	@GetMapping(value  = "/pg/{pgid}/unassigned/")
	public ResponseEntity<Object> getUnAssignedPackagesByGroupId(@PathVariable("pgid") int pgid){
		List<Packages> result = pkgRepo.getUnAssignedPackagesByGroupId(pgid);
		
		if(result != null) {
			return new ResponseEntity<Object> (result,HttpStatus.OK);
		}
		return new ResponseEntity<Object>(result,HttpStatus.NOT_FOUND);
	}
	
	@GetMapping(value = "/tg/{tgid}/assigned/")
	public ResponseEntity<Object> getAssginedPackagesByGroupId(@PathVariable("tgid") int tgid){
		List<Packages> result = pkgRepo.getAssignedPackageByTeamGroupId(tgid);
		return new ResponseEntity<Object>(result,HttpStatus.OK);
	}
	
}
