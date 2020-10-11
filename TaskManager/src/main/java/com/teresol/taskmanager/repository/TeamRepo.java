package com.teresol.taskmanager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.teresol.taskmanager.entity.Team;
import com.teresol.taskmanager.services.AssignedRecord;

public interface TeamRepo extends JpaRepository<Team, Integer> {
	
	
	@Query(value = "SELECT * FROM team_tl where team_group = ?1" , nativeQuery = true)
	List<Team> findTeamByTeamGroupId(int tgid);
	
	
}
