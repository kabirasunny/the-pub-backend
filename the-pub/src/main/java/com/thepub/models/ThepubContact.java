package com.thepub.models;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name = "thepub_contact")
public class ThepubContact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fullName;
	private String email;
	private long number;
	private String message;

	public ThepubContact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ThepubContact(int id, String fullName, String email, long number, String message) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.number = number;
		this.message = message;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "ThepubContact [id=" + id + ", fullName=" + fullName + ", email=" + email + ", number=" + number
				+ ", message=" + message + "]";
	}

}
