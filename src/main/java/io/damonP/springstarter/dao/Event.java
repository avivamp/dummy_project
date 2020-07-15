package io.damonP.springstarter.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Event implements Serializable{
	
	private static final long serialVersionUID = 7156526077883281623L;

	@Id
	private Integer id;
	private String name;
	private String type;
	private Integer price;
	private String currency;
	private Integer age;
	private String host;
	private String location;
	private String time;
	private String date;
	private Integer duration;
	private String category;
	private List<Image> images;
	private String shortDescription;
	private String longDescription;

	public Event() {
	}

	public Event(Integer id, String name, String type, Integer price, String currency, Integer age, String host,
			String location, String time, String date, Integer duration, String category,
			List<Image> images, String shortDescription, String longDescription) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
		this.currency = currency;
		this.age = age;
		this.host = host;
		this.location = location;
		this.time = time;
		this.date = date;
		this.duration = duration;
		this.category = category;
		this.images = images;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
	