package com.teresol.taskmanager.services;

public class TeamRecord {
	int RID;
	int PGID;
	String PackageGroup;
	int PID;
	String PackageName;
	int CID;
	String ClassName;
	String CRows;
	int TID;
	String TeamName;
	String FromLine;
	String ToLine;
	
	
	
	
	public TeamRecord(int rID, int pGID, String packageGroup, int pID, String packageName, int cID, String className,
			String cRows, int tID, String teamName, String fromLine, String toLine) {
		super();
		RID = rID;
		PGID = pGID;
		PackageGroup = packageGroup;
		PID = pID;
		PackageName = packageName;
		CID = cID;
		ClassName = className;
		CRows = cRows;
		TID = tID;
		TeamName = teamName;
		FromLine = fromLine;
		ToLine = toLine;
	}


	public int getRID() {
		return RID;
	}


	public void setRID(int rID) {
		RID = rID;
	}


	public int getPGID() {
		return PGID;
	}


	public void setPGID(int pGID) {
		PGID = pGID;
	}


	public String getPackageGroup() {
		return PackageGroup;
	}


	public void setPackageGroup(String packageGroup) {
		PackageGroup = packageGroup;
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


	public int getCID() {
		return CID;
	}


	public void setCID(int cID) {
		CID = cID;
	}


	public String getClassName() {
		return ClassName;
	}


	public void setClassName(String className) {
		ClassName = className;
	}


	public String getCRows() {
		return CRows;
	}


	public void setCRows(String cRows) {
		CRows = cRows;
	}


	public int getTID() {
		return TID;
	}


	public void setTID(int tID) {
		TID = tID;
	}


	public String getTeamName() {
		return TeamName;
	}


	public void setTeamName(String teamName) {
		TeamName = teamName;
	}


	public String getFromLine() {
		return FromLine;
	}


	public void setFromLine(String fromLine) {
		FromLine = fromLine;
	}


	public String getToLine() {
		return ToLine;
	}


	public void setToLine(String toLine) {
		ToLine = toLine;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + CID;
		result = prime * result + ((CRows == null) ? 0 : CRows.hashCode());
		result = prime * result + ((ClassName == null) ? 0 : ClassName.hashCode());
		result = prime * result + ((FromLine == null) ? 0 : FromLine.hashCode());
		result = prime * result + PGID;
		result = prime * result + PID;
		result = prime * result + ((PackageGroup == null) ? 0 : PackageGroup.hashCode());
		result = prime * result + ((PackageName == null) ? 0 : PackageName.hashCode());
		result = prime * result + RID;
		result = prime * result + TID;
		result = prime * result + ((TeamName == null) ? 0 : TeamName.hashCode());
		result = prime * result + ((ToLine == null) ? 0 : ToLine.hashCode());
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
		TeamRecord other = (TeamRecord) obj;
		if (CID != other.CID)
			return false;
		if (CRows == null) {
			if (other.CRows != null)
				return false;
		} else if (!CRows.equals(other.CRows))
			return false;
		if (ClassName == null) {
			if (other.ClassName != null)
				return false;
		} else if (!ClassName.equals(other.ClassName))
			return false;
		if (FromLine == null) {
			if (other.FromLine != null)
				return false;
		} else if (!FromLine.equals(other.FromLine))
			return false;
		if (PGID != other.PGID)
			return false;
		if (PID != other.PID)
			return false;
		if (PackageGroup == null) {
			if (other.PackageGroup != null)
				return false;
		} else if (!PackageGroup.equals(other.PackageGroup))
			return false;
		if (PackageName == null) {
			if (other.PackageName != null)
				return false;
		} else if (!PackageName.equals(other.PackageName))
			return false;
		if (RID != other.RID)
			return false;
		if (TID != other.TID)
			return false;
		if (TeamName == null) {
			if (other.TeamName != null)
				return false;
		} else if (!TeamName.equals(other.TeamName))
			return false;
		if (ToLine == null) {
			if (other.ToLine != null)
				return false;
		} else if (!ToLine.equals(other.ToLine))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "GetTeamRecord [RID=" + RID + ", PGID=" + PGID + ", PackageGroup=" + PackageGroup + ", PID=" + PID
				+ ", PackageName=" + PackageName + ", CID=" + CID + ", ClassName=" + ClassName + ", CRows=" + CRows
				+ ", TID=" + TID + ", TeamName=" + TeamName + ", FromLine=" + FromLine + ", ToLine=" + ToLine + "]";
	}
	
	
	
	
}
