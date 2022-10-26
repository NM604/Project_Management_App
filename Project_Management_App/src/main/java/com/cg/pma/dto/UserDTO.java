package com.cg.pma.dto;

import java.util.Objects;

public class UserDTO {
	
	Integer id;
	String name;
	String email;
	String contact;
	String loginName;
	String password;
	String status;
	String role;
	
	public UserDTO() {
		super();
	}

	public UserDTO(Integer id, String name, String email, String contact, String loginName, String password, String status,
			String role) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.loginName = loginName;
		this.password = password;
		this.status = status;
		this.role = role;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public int hashCode() {
		return Objects.hash(contact, email, id, loginName, name, password, role, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDTO other = (UserDTO) obj;
		return Objects.equals(contact, other.contact) && Objects.equals(email, other.email)
				&& Objects.equals(id, other.id) && Objects.equals(loginName, other.loginName)
				&& Objects.equals(name, other.name) && Objects.equals(password, other.password)
				&& Objects.equals(role, other.role) && Objects.equals(status, other.status);
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", contact=" + contact + ", loginName="
				+ loginName + ", password=" + password + ", status=" + status + ", role=" + role + "]";
	}
}
