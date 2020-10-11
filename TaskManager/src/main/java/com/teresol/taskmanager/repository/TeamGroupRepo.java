package com.teresol.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teresol.taskmanager.entity.TeamGroup;

public interface TeamGroupRepo extends JpaRepository<TeamGroup, Integer>{

}
