package io.damonP.springstarter.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Event {

	@Id
	private Integer id;
	private String name;
	private String time;
	private String date;
	private Integer duration;
	private String city;
	private String category;
	private String shortDescription;
	private String longDescription;

	public Event() {
	}

	public Event(Integer id, String name, String time, String date, Integer duration, String city, String category,
			String shortDescription, String longDescription) {
		super();
		this.id = id;
		this.name = name;
		this.time = time;
		this.date = date;
		this.duration = duration;
		this.city = city;
		this.category = category;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
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

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	
	
}
	