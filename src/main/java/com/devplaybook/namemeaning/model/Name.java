package com.devplaybook.namemeaning.model;

public class Name {
	private String name;
	private String meaning;
	private String gender;
	private Integer length;
	
	public Name(String name) {
		super();
		this.name = name;
		this.length = name.length();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMeaning() {
		return meaning;
	}
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	
	
}
