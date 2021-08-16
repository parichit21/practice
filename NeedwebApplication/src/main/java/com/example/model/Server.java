package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Server {
	
	@Id
	@GeneratedValue
	private String FirstName;
	private String lastname;
	private String email;
	private String password;
	
	public String getFirstName() {
		return FirstName;
	}
	public Server(String firstName, String lastname, String email, String password) {
		super();
		this.FirstName = firstName;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
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
	@Override
	public String toString() {
		return "Server [FirstName=" + FirstName + ", lastname=" + lastname + ", email=" + email + ", password="
				+ password + "]";
	}
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
