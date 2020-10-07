package com.javacourse.proect.hibernateAndJpa.Entities;

import javax.persistence.*;

@Entity
@Table(name="country")
public class Country {
	
	
	@Column(name="Code")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String code;
	
	@Column(name="name")
	private String name;
	
	@Column(name="region")
	private String region;
	
	@Column(name="continent")
	private String continent;
	
	
	@Id
	@Column(name="id")
	private int id;
	
	public Country(String code, String name, String region, String continent, int id) {
		super();
		this.code = code;
		this.name = name;
		this.region = region;
		this.continent = continent;
		this.id = id;
	}
	
	public Country() {}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public int getID() {
		return id;
	}
	public void setID(int id) {
		this.id = id;
	}
	
	
	
}
