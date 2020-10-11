package com.teresol.taskmanager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teresol.taskmanager.entity.TeamGroup;
import com.teresol.taskmanager.repository.TeamGroupRepo;

@Service
public class TeamGroupServices {

	@Autowired TeamGroupRepo tgRepo;
	
	/**
	 * 
	 * @param id
	 * @return  null if team no found
	 */
	public TeamGroup getTeamGroupById(int id) {
		return tgRepo.findById(id).orElse(null);
	}
	
	
	
}
