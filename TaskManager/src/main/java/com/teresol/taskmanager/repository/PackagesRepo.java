package com.teresol.taskmanager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.teresol.taskmanager.entity.Packages;

public interface PackagesRepo extends JpaRepository<Packages, Integer>{
	
	@Query(value = "SELECT * FROM packages_tl WHERE packages_group = ?1 and assigned_team_group is NULL",nativeQuery = true)
	public List<Packages> getUnAssignedPackagesByGroupId(int pgid);
	
	@Query(value = "SELECT * FROM packages_tl WHERE packages_group = ?1 and id = ?2 and assigned_team_group is NULL",nativeQuery = true)
	public Packages getUnAssignedPackageByGroupIdAndPackageId(int pgid,int pid);
	
	@Query(value = "SELECT * FROM packages_tl WHERE assigned_team_group = ?1",nativeQuery = true)
	public List<Packages> getAssignedPackageByTeamGroupId(int tgid);

}
