package com.gk;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.ResultSetExtractor;

@SuppressWarnings("rawtypes")
public class PersonResultSetExtractor implements ResultSetExtractor 
{
	public Object extractData(ResultSet rs)throws SQLException
	{
		Person person=new Person();
		
		person.setFirstName(rs.getString(1));
		
		person.setLastName(rs.getString(2));
		
		return person;
	}
}
