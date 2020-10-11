package com.teresol.taskmanager.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
@Table(
	    uniqueConstraints=
	        @UniqueConstraint(columnNames={"gid", "pid","cid","tid","fromLine","toLine"})
	)

@Entity(name = "record_tl")
public class Record {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer rid;
	  
		
	@Column(name = "gid")
	Integer gid;

	@Column(name = "pid")
	Integer pid; 

	@Column(name = "cid")
	Integer cid;

	@Column(name = "tid")
	Integer tid;
	 

	
	@Column(name = "fromLine")
	Integer from;

	@Column(name = "toLine")
	Integer to;

	@Column(name = "date")
	Date date;

	
	


	
	public Record(Integer gid, Integer pid, Integer cid, Integer tid, Integer from, Integer to, Date date) {
		super();
		this.gid = gid;
		this.pid = pid;
		this.cid = cid;
		this.tid = tid;
		this.from = from;
		this.to = to;
		this.date = date;
	}


	public Record() {
		super();
	}
	
	
	public Integer getRid() {
		return rid;
	}


	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public Integer getGid() {
		return gid;
	}


	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public Integer getFrom() {
		return from;
	}

	public void setFrom(Integer from) {
		this.from = from;
	}

	public Integer getTo() {
		return to;
	}

	public void setTo(Integer to) {
		this.to = to;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cid == null) ? 0 : cid.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((from == null) ? 0 : from.hashCode());
		result = prime * result + ((gid == null) ? 0 : gid.hashCode());
		result = prime * result + ((pid == null) ? 0 : pid.hashCode());
		result = prime * result + ((rid == null) ? 0 : rid.hashCode());
		result = prime * result + ((tid == null) ? 0 : tid.hashCode());
		result = prime * result + ((to == null) ? 0 : to.hashCode());
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
		Record other = (Record) obj;
		if (cid == null) {
			if (other.cid != null)
				return false;
		} else if (!cid.equals(other.cid))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (from == null) {
			if (other.from != null)
				return false;
		} else if (!from.equals(other.from))
			return false;
		if (gid == null) {
			if (other.gid != null)
				return false;
		} else if (!gid.equals(other.gid))
			return false;
		if (pid == null) {
			if (other.pid != null)
				return false;
		} else if (!pid.equals(other.pid))
			return false;
		if (rid == null) {
			if (other.rid != null)
				return false;
		} else if (!rid.equals(other.rid))
			return false;
		if (tid == null) {
			if (other.tid != null)
				return false;
		} else if (!tid.equals(other.tid))
			return false;
		if (to == null) {
			if (other.to != null)
				return false;
		} else if (!to.equals(other.to))
			return false;
		return true;
	}





	@Override
	public String toString() {
		return "Record [rid=" + rid + ", gid=" + gid + ", pid=" + pid + ", cid=" + cid + ", tid=" + tid + ", from="
				+ from + ", to=" + to + ", date=" + date + "]";
	}
	
	

}
