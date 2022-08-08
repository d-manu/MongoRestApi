package com.example.demo.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="student")
public class Student {
	
	@Id
	private ObjectId _id;
	private String name;
	private double age;
	private int grade;
	
	public Student() {
		super();
		
	}
	public Student(ObjectId _id, String name, double age, int grade) {
		super();
		this._id=_id;
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
//	public ObjectId getId() {
//		return id;
//	}
//	public void setId(ObjectId id) {
//		this.id = id;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}
