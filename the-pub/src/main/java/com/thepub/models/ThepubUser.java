package com.thepub.models;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name = "thepub_user")
public class ThepubUser {

	@Column(name = "FullName")
	private String fullName;
	@Column(name = "Email")
	private String email;
	@Id
	@Column(name = "Number")
	private long number;

	public ThepubUser() {
		super();
	}

	public ThepubUser(String fullName, String email, long number) {
		this.fullName = fullName;
		this.email = email;
		this.number = number;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "ThepubUser [ fullName=" + fullName + ", email=" + email + ", number=" + number + "]";
	}

}
