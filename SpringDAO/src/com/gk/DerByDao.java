package com.gk;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class DerByDao implements IDao
{
	private DataSource datasource;
	
	public void setDataSource(DataSource ds)
	{
		datasource=ds;
	}
	
	public void create(String firstname,String lastname)
	{
		JdbcTemplate insert=new JdbcTemplate(datasource);
		
		insert.update("INSERT INTO PERSON(FIRSTNAME,LASTNAME) VALUES(?,?)",new Object[]{firstname,lastname});
		
	}
	
	
	public List<Person> select(String firstname,String lastname)
	{
		JdbcTemplate select=new JdbcTemplate(datasource);
		
		return select.query("SELECT FIRSTNAME,LASTNAME FROM PERSON WHERE FIRSTNAME=?,LASTNAME=?",new Object[]{firstname,lastname},new PersonRowMapper());
	}
	
	
	public List<Person> selectAll()
	{
		JdbcTemplate select=new JdbcTemplate(datasource);
		
		return select.query("SELECT FIRSTNAME,LASTNAME FROM PERSON ",new PersonRowMapper());	
	}
	
	public void deleteAll()
	{
		JdbcTemplate delete=new JdbcTemplate(datasource);
		
		delete.update("DELETE FROM PERSON");
	}
	
	public void delete(String firstname,String lastname)
	{
		JdbcTemplate delete=new JdbcTemplate(datasource);
		
		delete.update("DELETE FROM PERSON WHERE FIRSTNAME=?,LASTNAME=?",new Object[]{firstname,lastname});
	}

}




