package com.cg.pma.entity;

import java.time.LocalDate;
import java.util.Objects;

public class ProjectTask {
	
	Integer id;
	String projectSequence;
	String summary;
	String acceptanceCriteria;
	String status;
	LocalDate dueDate;
	Backlog backLog;
	Integer projectIdentifier;
	LocalDate createdAt;
	LocalDate updatedAt;
	public ProjectTask() {
		super();
	}
	public ProjectTask(Integer id, String projectSequence, String summary, String acceptanceCriteria, String status,
			LocalDate dueDate, Backlog backLog, Integer projectIdentifier, LocalDate createdAt, LocalDate updatedAt) {
		super();
		this.id = id;
		this.projectSequence = projectSequence;
		this.summary = summary;
		this.acceptanceCriteria = acceptanceCriteria;
		this.status = status;
		this.dueDate = dueDate;
		this.backLog = backLog;
		this.projectIdentifier = projectIdentifier;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProjectSequence() {
		return projectSequence;
	}
	public void setProjectSequence(String projectSequence) {
		this.projectSequence = projectSequence;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getAcceptanceCriteria() {
		return acceptanceCriteria;
	}
	public void setAcceptanceCriteria(String acceptanceCriteria) {
		this.acceptanceCriteria = acceptanceCriteria;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public Backlog getBackLog() {
		return backLog;
	}
	public void setBackLog(Backlog backLog) {
		this.backLog = backLog;
	}
	public Integer getProjectIdentifier() {
		return projectIdentifier;
	}
	public void setProjectIdentifier(Integer projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
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
	@Override
	public String toString() {
		return "ProjectTask [id=" + id + ", projectSequence=" + projectSequence + ", summary=" + summary
				+ ", acceptanceCriteria=" + acceptanceCriteria + ", status=" + status + ", dueDate=" + dueDate
				+ ", backLog=" + backLog + ", projectIdentifier=" + projectIdentifier + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(acceptanceCriteria, backLog, createdAt, dueDate, id, projectIdentifier, projectSequence,
				status, summary, updatedAt);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProjectTask other = (ProjectTask) obj;
		return Objects.equals(acceptanceCriteria, other.acceptanceCriteria) && Objects.equals(backLog, other.backLog)
				&& Objects.equals(createdAt, other.createdAt) && Objects.equals(dueDate, other.dueDate)
				&& Objects.equals(id, other.id) && Objects.equals(projectIdentifier, other.projectIdentifier)
				&& Objects.equals(projectSequence, other.projectSequence) && Objects.equals(status, other.status)
				&& Objects.equals(summary, other.summary) && Objects.equals(updatedAt, other.updatedAt);
	}
}
