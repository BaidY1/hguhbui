package com.teresol.taskmanager.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "packages_tl")
public class Packages {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	@Column(name = "name")
	String Name;
	
	@Column(name = "packageId")
	String packageId;

	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "packagesGroup")
	PackagesGroup packagesGroup;
	
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "assignedTeamGroup")
	TeamGroup assignedTeamGroup;
	
	
	@OneToMany(mappedBy = "packages")
	@JsonIgnore
	Set<Classes> classes =  new  HashSet<Classes>();
	
	public String getPackageId() {
		return packageId;
	}
	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}
	public Set<Classes> getClasses() {
		return classes;
	}
	public void setClasses(Set<Classes> classes) {
		this.classes = classes;
	}
	public TeamGroup getAssignedTeamGroup() {
		return assignedTeamGroup;
	}
	public void setAssignedTeamGroup(TeamGroup assignedTeamGroup) {
		this.assignedTeamGroup = assignedTeamGroup;
	}
	
	
	public PackagesGroup getPackagesGroup() {
		return packagesGroup;
	}
	public void setPackagesGroup(PackagesGroup packagesGroup) {
		this.packagesGroup = packagesGroup;
	}
	
	
	public Packages(String name, String packageId) {
		super();
		Name = name;
		this.packageId = packageId;
	}
	public Packages() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return Name;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		Name = name;
	}

}
