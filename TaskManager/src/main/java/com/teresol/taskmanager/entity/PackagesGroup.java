package com.teresol.taskmanager.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "packages_group_tl")
public class PackagesGroup {

	
	@Id
	Integer id;
	@Column(name = "name")
	String Name;
	
	
	@OneToMany(mappedBy = "packagesGroup")
	@JsonIgnore
	Set<Packages> packages  = new HashSet<Packages>();
	
	
	
	
	
	
	
	
	public Set<Packages> getPackages() {
		return packages;
	}
	public void setPackages(Set<Packages> packages) {
		this.packages = packages;
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
	public PackagesGroup() {
		super();
	}
	public PackagesGroup(Integer id, String name) {
		super();
		this.id = id;
		Name = name;
	}
	
	
	
	
	
	
	
}
