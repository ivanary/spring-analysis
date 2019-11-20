package org.springframework.analysis.bean.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



public class PersonBean {
	private Student student;

	public PersonBean() {
	}

	public PersonBean(Student student) {
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public void send(){
		System.out.println("I am send method from PersonBean!");
	}
	public void init() {
		System.out.println("Init!");
	}
}
