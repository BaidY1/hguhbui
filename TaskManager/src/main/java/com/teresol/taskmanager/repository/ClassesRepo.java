package com.teresol.taskmanager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.teresol.taskmanager.entity.Classes;

public interface ClassesRepo extends JpaRepository<Classes, Integer>{

	
	@Query( value = "SELECT * FROM classes_tl where packages = ?1 and assigned_team is NULL",nativeQuery =true)
	public List<Classes> findAllUnAssignedPackageById(int pid);
	@Query(value = "SELECT * FROM classes_tl where assigned_team = ?1",nativeQuery = true)
	public List<Classes> findAllAssignedClassesByTid(int tid);
}
