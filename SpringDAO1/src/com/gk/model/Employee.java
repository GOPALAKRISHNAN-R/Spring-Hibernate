package com.gk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="employee")

public class Employee 
{
	
	
	private int id;
	private String name;
	private int age;
	
	@Id
	@Column(name="id")
	public void getId(int id)
	{
		this.id=id;
	}
	
	public int setId()
	{
		return id;
	}

	@Column(name="name")
	public void getName(String name)
	{
		this.name=name;
	}
	
	public String setName()
	{
		return name;
	}
	
	@Column(name="age")
	public void getAge(int age)
	{
		this.age=age;
	}
	
	public int setAge()
	{
		return age;
	}
}
