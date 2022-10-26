package com.cg.pma.entity;

import java.util.List;
import java.util.Objects;

public class Backlog {
	
	Integer id;
	String PTSequence;
	Integer projectIdentifier;
	Project project;
	List<ProjectTask> projects;
	public Backlog() {
		super();
	}
	public Backlog(Integer id, String pTSequence, Integer projectIdentifier, Project project,
			List<ProjectTask> projects) {
		super();
		this.id = id;
		PTSequence = pTSequence;
		this.projectIdentifier = projectIdentifier;
		this.project = project;
		this.projects = projects;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPTSequence() {
		return PTSequence;
	}
	public void setPTSequence(String pTSequence) {
		PTSequence = pTSequence;
	}
	public Integer getProjectIdentifier() {
		return projectIdentifier;
	}
	public void setProjectIdentifier(Integer projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public List<ProjectTask> getProjects() {
		return projects;
	}
	public void setProjects(List<ProjectTask> projects) {
		this.projects = projects;
	}
	@Override
	public String toString() {
		return "Backlog [id=" + id + ", PTSequence=" + PTSequence + ", projectIdentifier=" + projectIdentifier
				+ ", project=" + project + ", projects=" + projects + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(PTSequence, id, projectIdentifier, projects);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Backlog other = (Backlog) obj;
		return Objects.equals(PTSequence, other.PTSequence) && Objects.equals(id, other.id)
				&& Objects.equals(projectIdentifier, other.projectIdentifier)
				&& Objects.equals(projects, other.projects);
	}
}
