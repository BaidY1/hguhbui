package com.teresol.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.teresol.taskmanager.entity.Record;

public interface RecordRepo extends JpaRepository<Record, Integer>{
	
	
	
}
