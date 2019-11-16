package com.gk.dao;

import java.util.List;

import com.gk.model.Person;

public interface PersonDAO {

	public void save(Person p);
	
	public List<Person> list();
	
}