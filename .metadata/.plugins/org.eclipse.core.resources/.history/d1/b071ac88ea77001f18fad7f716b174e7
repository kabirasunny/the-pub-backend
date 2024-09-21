package com.thepub.models;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name = "thepub_table")
public class ThepubTable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String guests;
	private String date;
	private String time;
	private long number;

	public ThepubTable() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ThepubTable(int id, String guests, String date, String time) {
		super();
		this.id = id;
		this.guests = guests;
		this.date = date;
		this.time = time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGuests() {
		return guests;
	}

	public void setGuests(String guests) {
		this.guests = guests;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "ThepubTable [id=" + id + ", guests=" + guests + ", date=" + date + ", time=" + time + ", number="
				+ number + "]";
	}

}
