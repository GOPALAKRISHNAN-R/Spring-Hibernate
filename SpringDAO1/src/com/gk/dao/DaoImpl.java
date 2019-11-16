package com.gk.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DaoImpl implements IDao
{
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}
	
	public String getEmployeeName(int id)
	{
		
		String sql="select name from employee where id=?";
		String name=jdbcTemplate.queryForObject(sql,new Object[]{id},String.class);
		return name;
		
	}

}
