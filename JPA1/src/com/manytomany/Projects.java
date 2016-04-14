package com.manytomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Projects {

	public Projects() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	 int projectId;
	String projDesc;
	public String getProjDesc() {
		return projDesc;
	}
	public void setProjDesc(String projDesc) {
		this.projDesc = projDesc;
	}

	@ManyToMany(mappedBy="projects", cascade=CascadeType.ALL)
	 Set<Worker> workers = new HashSet<Worker>();
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public Set<Worker> getWorkers() {
		return workers;
	}
	public void setWorkers(Set<Worker> workers) {
		this.workers = workers;
	}
	public Projects(int projectId, Set<Worker> workers) {
		super();
		this.projectId = projectId;
		this.workers = workers;
	}
	
	
}
