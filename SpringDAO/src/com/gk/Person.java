package com.gk;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person")

public class Person 
{
	
	private String firstname;
	private String lastname;
	
	@Id
	@Column(name="FIRST_NAME")
	public String getFirstName()
	{
		return firstname;
	}
	
	public void setFirstName(String firstname)
	{
		this.firstname=firstname;
	}
	
	@Column(name="LAST_NAME")
	public String getLastName()
	{
		return lastname;
	}
	
	public void setLastName(String lastname)
	{
		this.lastname=lastname;
	}
}
