package com.teresol.taskmanager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name= "Classes_tl")
public class Classes {
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	
	@Column(name="nrow")
	Integer nRows;
	@Column(name="name")
	String name;
	
	
	
	@Column(name="classId")
	String classId;
	
	@ManyToOne
	@JoinColumn(name = "packages")
	Packages packages;
	
	@ManyToOne
	@JoinColumn(name = "assignedTeam")
	Team assignedTeam;
	
	
	
	public Classes(Integer nRows, String name, String classId) {
		super();
		this.nRows = nRows;
		this.name = name;
		this.classId = classId;
	}
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public Packages getPackages() {
		return packages;
	}
	public void setPackages(Packages packages) {
		this.packages = packages;
	}
	public Team getAssignedTeam() {
		return assignedTeam;
	}
	public void setAssignedTeam(Team assignedTeam) {
		this.assignedTeam = assignedTeam;
	}
	public Packages getPackages_cl() {
		return packages;
	}
	public void setPackages_cl(Packages packages) {
		this.packages = packages;
	}

	public Classes() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getnRows() {
		return nRows;
	}
	public void setnRows(Integer nRows) {
		this.nRows = nRows;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}
