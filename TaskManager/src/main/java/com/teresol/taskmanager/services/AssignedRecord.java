package com.teresol.taskmanager.services;

public class AssignedRecord {
	String Classes,Package,Team;

	public AssignedRecord(String class1, String package1, String team) {
		super();
		Classes = class1;
		Package = package1;
		Team = team;
	}

	public AssignedRecord() {
		super();
	}

	public String getClasses() {
		return Classes;
	}

	public void setClasses(String classes) {
		Classes = classes;
	}

	public String getPackage() {
		return Package;
	}

	public void setPackage(String package1) {
		Package = package1;
	}

	public String getTeam() {
		return Team;
	}

	public void setTeam(String team) {
		Team = team;
	}

	@Override
	public String toString() {
		return "ResultRecord [Class=" + Classes + ", Package=" + Package + ", Team=" + Team + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Classes == null) ? 0 : Classes.hashCode());
		result = prime * result + ((Package == null) ? 0 : Package.hashCode());
		result = prime * result + ((Team == null) ? 0 : Team.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AssignedRecord other = (AssignedRecord) obj;
		if (Classes == null) {
			if (other.Classes != null)
				return false;
		} else if (!Classes.equals(other.Classes))
			return false;
		if (Package == null) {
			if (other.Package != null)
				return false;
		} else if (!Package.equals(other.Package))
			return false;
		if (Team == null) {
			if (other.Team != null)
				return false;
		} else if (!Team.equals(other.Team))
			return false;
		return true;
	}
	
	
	
	

}
