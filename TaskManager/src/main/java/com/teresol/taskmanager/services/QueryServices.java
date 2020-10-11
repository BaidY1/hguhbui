package com.teresol.taskmanager.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teresol.taskmanager.entity.Packages;
import com.teresol.taskmanager.entity.Team;
import com.teresol.taskmanager.repository.TeamRepo;

@Service
public class QueryServices {
	
	@Autowired EntityManagerFactory emf;

	@Autowired
	TeamRepo obj;
	public List<Packages> getUnAssignedPackagesByGroupId(int pgid){
		EntityManager em = emf.createEntityManager();
		String squery = "SELECT packages_tl FROM packages_tl pt WHERE pt.packagesGroup = " + pgid +" and pt.assignedTeamGroup is NULL";
		Query query = em.createQuery(squery);
		System.out.println(squery);
		@SuppressWarnings("unchecked")
		List<Packages>  result = (List<Packages>) query.getResultList();
		return result;
	}
	
	
	public List<AssignedRecord> getResult(){
		EntityManager em = emf.createEntityManager();
		String squery = "Select class.name as Classes,package.name as Package,team.name as Team from classes_tl as class inner join packages_tl as package\n" + 
				"on class.packages = package.id\n" + 
				"inner join team_tl as team on team.id = class.assigned_team";
		Query query = em.createNativeQuery(squery);
		@SuppressWarnings("unchecked")
		List<AssignedRecord>  result = (List<AssignedRecord>) query.getResultList();
		em.clear();
		em.close();
		return result;
	}
	
	public List<AllRecord> getAllRecord(){
		EntityManager em = emf.createEntityManager();
		String sQuery = "SELECT pgt.name as PackageGroupName, pt.id as PID, pt.name as PackageName, pt.assigned_team_group as ACID, tgt.name as AssignedCompany,ct.id as ClassID, ct.name as ClassName, ct.assigned_team as ATID, tt.name as TeamName, pgt.id as PGID\n" + 
				"FROM packages_group_tl pgt INNER JOIN packages_tl pt on pgt.id = pt.packages_group INNER JOIN classes_tl ct on ct.packages = pt.id\n" + 
				"LEFT JOIN team_group_tl tgt on pt.assigned_team_group = tgt.id LEFT JOIN team_tl tt on ct.assigned_team = tt.id";
		Query query = em.createNativeQuery(sQuery);
		
		@SuppressWarnings("unchecked")
		List<AllRecord> result = (List<AllRecord>) query.getResultList();
		em.clear();
		em.close();
		return result;
	}
	
	public List<TeamRecord> getTeamRecord(int tid,int cid){
		EntityManager em = emf.createEntityManager();
		String sQuery = "Select rt.rid as RID, pgt.id as PGID, pgt.name as PackageGroup, pt.id as PID, pt.name as PackageName,ct.id as CID, ct.name as ClassName, ct.nrow as CRows, tt.id as TID,tt.name as TeamName, rt.from_line as FromLine,rt.to_line as ToLine from record_tl rt\n" + 
				"LEFT JOIN packages_group_tl pgt on rt.gid = pgt.id\n" + 
				"LEFT JOIN packages_tl pt on rt.pid = pt.id\n" + 
				"LEFT JOIN classes_tl ct on rt.cid = ct.id\n" + 
				"LEFT JOIN team_tl tt on rt.tid = tt.id\n" + 
				"WHERE rt.tid = "+ tid + " \n" +
				"and rt.cid = " + cid + " \n"+
				"ORDER BY pgt.id, pt.id, ct.id, rt.from_line";
		Query query = em.createNativeQuery(sQuery);
		@SuppressWarnings("unchecked")
		List<TeamRecord> result = (List<TeamRecord>) query.getResultList();
		em.clear();
		em.close();
		return result;
	}
	
	public List<TeamRecord> getTeamRecord(int cid){
		EntityManager em = emf.createEntityManager();
		String sQuery = "select pgt.name as PackageGroupName, pt.id as PID, pt.name as PackageName, ct.id as ClassID, ct.name as ClassName, pgt.id as PGID from\n" + 
				"packages_group_tl pgt inner join packages_tl pt on pgt.id = pt.packages_group \n" + 
				"inner join classes_tl ct on ct.packages = pt.id\n" + 
				"where ct.id = " + cid;
		Query query = em.createNativeQuery(sQuery);
		@SuppressWarnings("unchecked")
		List<TeamRecord> result = (List<TeamRecord>) query.getResultList();
		em.clear();
		em.close();
		return result;
	}
	

	
	
	
}
