package com.rsk.springdatajpa.single_table_strategy.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private int flat;
	private String city;
	private String country;
	
	public int getFlat() {
		return flat;
	}
	public void setFlat(int flat) {
		this.flat = flat;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
