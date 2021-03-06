package com.worksap.salespusher.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.worksap.salespusher.utils.PasswordHash;

@Entity
@Table(name="users")
public class UserEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String username;
	private String password;
	@Column(name="firstname")
	private String firstname;
	@Column(name="lastname")
	private String lastname;
	private String email;
	@Column(name="office_id")
	private int office;
	private String role;
	
	protected UserEntity() {}
	
	public UserEntity(String username, String password, String firstname, String lastname, String email,int office, String role){
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		if (password != null) {
			PasswordHash hash = new PasswordHash();
			this.password = hash.encode(password);
		}
		
		this.office = office;
		this.role = role;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername(){
		return username;
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getOffice() {
		return office;
	}

	public void setOffice(int office) {
		this.office = office;
	}
	
	public String getRole(){
		return role;
	}
	
	public void setRoles(String role){
		this.role = role;
	}
}
