package com.javalec.ex;

import java.util.ArrayList;

public class Student {

	private String name;
	private int age;
	private ArrayList<String> hobbys;
	private int Height;
	
	public int getHeight() {
		return Height;
	}

	public void setHeight(int height) {
		Height = height;
	}

	public Student(String name) {
		this.name=name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ArrayList<String> getHobbys() {
		return hobbys;
	}

	public void setHobbys(ArrayList<String> hobbys) {
		this.hobbys = hobbys;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name, int age, ArrayList<String> hobbys) {
		super();
		this.name = name;
		this.age = age;
		this.hobbys = hobbys;
	}
	
	
}
