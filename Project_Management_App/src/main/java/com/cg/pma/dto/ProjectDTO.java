package com.cg.pma.dto;

import java.time.LocalDate;
import java.util.Objects;

public class ProjectDTO {
	
	Integer id;
	String projectName;
	Integer projectIdentifier;
	String description;
	LocalDate startDate;
	LocalDate endDate;
	LocalDate createdAt;
	LocalDate updatedAt;
	BacklogDTO backlog;
	public ProjectDTO() {
		super();
	}
	public ProjectDTO(Integer id, String projectName, Integer projectIdentifier, String description, LocalDate startDate,
			LocalDate endDate, LocalDate createdAt, LocalDate updatedAt, BacklogDTO backlog) {
		super();
		this.id = id;
		this.projectName = projectName;
		this.projectIdentifier = projectIdentifier;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.backlog = backlog;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public Integer getProjectIdentifier() {
		return projectIdentifier;
	}
	public void setProjectIdentifier(Integer projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public LocalDate getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDate getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDate updatedAt) {
		this.updatedAt = updatedAt;
	}
	public BacklogDTO getBacklog() {
		return backlog;
	}
	public void setBacklog(BacklogDTO backlog) {
		this.backlog = backlog;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", projectName=" + projectName + ", projectIdentifier=" + projectIdentifier
				+ ", description=" + description + ", startDate=" + startDate + ", endDate=" + endDate + ", createdAt="
				+ createdAt + ", updatedAt=" + updatedAt + ", backlog=" + backlog + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(backlog, createdAt, description, endDate, id, projectIdentifier, projectName, startDate,
				updatedAt);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProjectDTO other = (ProjectDTO) obj;
		return Objects.equals(backlog, other.backlog) && Objects.equals(createdAt, other.createdAt)
				&& Objects.equals(description, other.description) && Objects.equals(endDate, other.endDate)
				&& Objects.equals(id, other.id) && Objects.equals(projectIdentifier, other.projectIdentifier)
				&& Objects.equals(projectName, other.projectName) && Objects.equals(startDate, other.startDate)
				&& Objects.equals(updatedAt, other.updatedAt);
	}
}
