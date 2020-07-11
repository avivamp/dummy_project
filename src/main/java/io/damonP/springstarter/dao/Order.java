package io.damonP.springstarter.dao;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Order {
	
	@Id
	private Integer id;
	private String name;
	private String cart_id;
	private String currency;
	private Customer customer;
	private List<Event> items;
	
	public Order() {
	}
	
	public Order(Integer id, String name, String cart_id, String currency, Customer customer,
			List<Event> items) {
		super();
		this.id = id;
		this.name = name;
		this.cart_id = cart_id;
		this.currency = currency;
		this.customer = customer;
		this.items = items;
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
	public String getCart_id() {
		return cart_id;
	}
	public void setCart_id(String cart_id) {
		this.cart_id = cart_id;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Event> getItems() {
		return items;
	}
	public void setItems(List<Event> items) {
		this.items = items;
	}
}
