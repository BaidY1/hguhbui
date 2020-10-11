package com.teresol.taskmanager.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity(name  = "team_tl")
public class Team {
	@Id
	Integer id;
	@Column(name = "name")
	String Name;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "teamGroup")
	TeamGroup teamGroup;
	
	@OneToMany(mappedBy="assignedTeam")
	@JsonIgnore
	Set<Classes> assignedClasses = new HashSet<Classes>();

	
	
	public Set<Classes> getAssignedClasses() {
		return assignedClasses;
	}

	public void setAssignedClasses(Set<Classes> assignedClasses) {
		this.assignedClasses = assignedClasses;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	
	public TeamGroup getTeamGroup() {
		return teamGroup;
	}

	public void setTeamGroup(TeamGroup teamGroup) {
		this.teamGroup = teamGroup;
	}

	public Team() {
		super();
	}

	public Team(Integer id, String name) {
		super();
		this.id = id;
		Name = name;
	}
	
	
	
}
