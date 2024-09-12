package com.thepub.models;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name = "ThepubCards")
public class ThepubCards {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String image;
	private String title;
	private double price;

	public ThepubCards() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ThepubCards(int id, String image, String title, double price) {
		super();
		this.id = id;
		this.image = image;
		this.title = title;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ThepubCards [id=" + id + ", image=" + image + ", title=" + title + ", price=" + price + "]";
	}

}
