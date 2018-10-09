package com.web.awstest.awstest;

public class User {
	
	private String name;
	private String email;
	private String pwd;
	private Integer id;
	
	private String height;
	private String weight;
	
	private double userBmi;
	
	
	
	
	public double getUserBmi() {
		return userBmi;
	}
	public void setUserBmi(double userBmi) {
		this.userBmi = userBmi;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

}
