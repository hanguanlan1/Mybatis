package com.wisedu.bean;

import java.io.Serializable;

/**
 * @author 01212021
 * @time 2016-4-21ÏÂÎç04:13:09
 */
public class User implements Serializable{
	private int id;
	private String name;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [age=" + age + ", id=" + id + ", name=" + name + "]";
	}
}
