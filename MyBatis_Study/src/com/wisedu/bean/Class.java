/**
 * 
 */
package com.wisedu.bean;

import java.util.List;

/**
 * @author 01212021
 * @time 2016-4-22ÉÏÎç09:20:50
 */
public class Class {
	private int id; 
	private String name;
	private Teacher teacher;
	 private List<Student> students;
	 
	/**
	 * @return the students
	 */
	public List<Student> getStudents() {
		return students;
	}
	/**
	 * @param students the students to set
	 */
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the teacher
	 */
	public Teacher getTeacher() {
		return teacher;
	}
	/**
	 * @param teacher the teacher to set
	 */
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Class [id=" + id + ", name=" + name + ", students=" + students
				+ ", teacher=" + teacher + "]";
	}
}
