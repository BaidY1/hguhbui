package com.teresol.taskmanager.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "team_group_tl")
public class TeamGroup {
	@Id
	Integer id;
	@Column(name="name")
	String name;
	
	@OneToMany(mappedBy = "teamGroup")
	Set<Team> teams  = new HashSet<Team>();
	//Set<Team> teamGroup  = new HashSet<Team>();

	@OneToMany(mappedBy="assignedTeamGroup")
	Set<Packages> assignedPackages = new HashSet<Packages>();
	
	
	public Set<Team> getTeams() {
		return teams;
	}

	public void setTeams(Set<Team> teams) {
		this.teams= teams;
	}

	public Set<Packages> getAssignedPackages() {
		return assignedPackages;
	}

	public void setAssignedPackages(Set<Packages> assignedPackages) {
		this.assignedPackages = assignedPackages;
	}

	public TeamGroup(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public TeamGroup() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	
}
