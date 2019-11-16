package com.gk;

import java.util.List;

import javax.sql.DataSource;

public interface IDao 
{
	void setDataSource(DataSource ds);
	
	void create(String firstname,String lastname);
	
	List<Person> select(String firstname,String lastname);
	
	List<Person> selectAll();
	
	void deleteAll();
	
	void delete(String firstname,String lastname);
	

}
