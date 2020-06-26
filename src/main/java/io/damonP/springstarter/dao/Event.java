package io.damonP.springstarter.dao;

public class Event {

	private String event_id;
	private String event_name;
	private String event_time;
	private String event_date;
	private int duration;
	private String city;
	private String category;

	public Event() {
}
	public Event(String event_id, String event_name, String event_time, String event_date, int duration, String city, String category) {
		super();
		this.event_id = event_id;
		this.event_name = event_name;
		this.event_time = event_time;
		this.event_date = event_date;
		this.duration = duration;
		this.city = city;
		this.category = category;
	}
	public String getEvent_time() {
		return event_time;
	}
	public String getEvent_date() {
		return event_date;
	}
	public void setEvent_date(String event_date) {
		this.event_date = event_date;
	}
	public void setEvent_time(String event_time) {
		this.event_time = event_time;
	}
	public String getEvent_id() {
		return event_id;
	}
	public void setEvent_id(String event_id) {
		this.event_id = event_id;
	}
	public String getEvent_name() {
		return event_name;
	}
	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
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
}