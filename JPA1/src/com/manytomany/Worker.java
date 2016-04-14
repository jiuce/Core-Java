package com.manytomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Worker {

	public Worker() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	int workerId;
	String workerName;
	@ManyToMany
	Set<Projects> projects = new HashSet<Projects>();
	public int getWorkerId() {
		return workerId;
	}
	public void setWorkerId(int workerId) {
		this.workerId = workerId;
	}
	public String getWorkerName() {
		return workerName;
	}
	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}
	public Set<Projects> getProjects() {
		return projects;
	}
	public void setProjects(Set<Projects> projects) {
		this.projects = projects;
	}
	public Worker(int workerId, String workerName, Set<Projects> projects) {
		super();
		this.workerId = workerId;
		this.workerName = workerName;
		this.projects = projects;
	}
	
	
}
