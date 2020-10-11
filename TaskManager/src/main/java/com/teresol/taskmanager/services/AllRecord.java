package com.teresol.taskmanager.services;

import java.sql.Date;

import org.springframework.web.bind.annotation.PostMapping;

public class AllRecord {
	
	
	String PackageGroupName;
	int PID;
	String PackageName;
	int ACID;
	String AssignedCompany;
	int ClassID;
	String ClassName;
	int ATID;
	String TeamName;
	int PGID;
	
	
	
	public AllRecord(String packageGroupName, int pID, String packageName, int classID, String className, int pGID) {
		super();
		PackageGroupName = packageGroupName;
		PID = pID;
		PackageName = packageName;
		ClassID = classID;
		ClassName = className;
		PGID = pGID;
	}

	public AllRecord(String packageGroupName, int pID, String packageName, int aCID, String assignedCompany,
			int classID, String className, int aTID, String teamName,int PGID) {
		super();
		PackageGroupName = packageGroupName;
		PID = pID;
		PackageName = packageName;
		ACID = aCID;
		AssignedCompany = assignedCompany;
		ClassID = classID;
		ClassName = className;
		ATID = aTID;
		TeamName = teamName;
		PGID = this.PGID;
	}
	
	public int getPGID() {
		return PGID;
	}
	public void setPGID(int pGID) {
		PGID = pGID;
	}
	public AllRecord() {
		super();
	}
	public String getPackageGroupName() {
		return PackageGroupName;
	}
	public void setPackageGroupName(String packageGroupName) {
		PackageGroupName = packageGroupName;
	}
	public int getPID() {
		return PID;
	}
	public void setPID(int pID) {
		PID = pID;
	}
	public String getPackageName() {
		return PackageName;
	}
	public void setPackageName(String packageName) {
		PackageName = packageName;
	}
	public int getACID() {
		return ACID;
	}
	public void setACID(int aCID) {
		ACID = aCID;
	}
	public String getAssignedCompany() {
		return AssignedCompany;
	}
	public void setAssignedCompany(String assignedCompany) {
		AssignedCompany = assignedCompany;
	}
	public int getClassID() {
		return ClassID;
	}
	public void setClassID(int classID) {
		ClassID = classID;
	}
	public String getClassName() {
		return ClassName;
	}
	public void setClassName(String className) {
		ClassName = className;
	}
	public int getATID() {
		return ATID;
	}
	public void setATID(int aTID) {
		ATID = aTID;
	}
	public String getTeamName() {
		return TeamName;
	}
	public void setTeamName(String teamName) {
		TeamName = teamName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ACID;
		result = prime * result + ATID;
		result = prime * result + ((AssignedCompany == null) ? 0 : AssignedCompany.hashCode());
		result = prime * result + ClassID;
		result = prime * result + ((ClassName == null) ? 0 : ClassName.hashCode());
		result = prime * result + PGID;
		result = prime * result + PID;
		result = prime * result + ((PackageGroupName == null) ? 0 : PackageGroupName.hashCode());
		result = prime * result + ((PackageName == null) ? 0 : PackageName.hashCode());
		result = prime * result + ((TeamName == null) ? 0 : TeamName.hashCode());
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
		AllRecord other = (AllRecord) obj;
		if (ACID != other.ACID)
			return false;
		if (ATID != other.ATID)
			return false;
		if (AssignedCompany == null) {
			if (other.AssignedCompany != null)
				return false;
		} else if (!AssignedCompany.equals(other.AssignedCompany))
			return false;
		if (ClassID != other.ClassID)
			return false;
		if (ClassName == null) {
			if (other.ClassName != null)
				return false;
		} else if (!ClassName.equals(other.ClassName))
			return false;
		if (PGID != other.PGID)
			return false;
		if (PID != other.PID)
			return false;
		if (PackageGroupName == null) {
			if (other.PackageGroupName != null)
				return false;
		} else if (!PackageGroupName.equals(other.PackageGroupName))
			return false;
		if (PackageName == null) {
			if (other.PackageName != null)
				return false;
		} else if (!PackageName.equals(other.PackageName))
			return false;
		if (TeamName == null) {
			if (other.TeamName != null)
				return false;
		} else if (!TeamName.equals(other.TeamName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "AllRecord [PackageGroupName=" + PackageGroupName + ", PID=" + PID + ", PackageName=" + PackageName
				+ ", ACID=" + ACID + ", AssignedCompany=" + AssignedCompany + ", ClassID=" + ClassID + ", ClassName="
				+ ClassName + ", ATID=" + ATID + ", TeamName=" + TeamName + ", PGID=" + PGID + "]";
	}

	
	

}
