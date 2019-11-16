package com.gk;

import java.util.List;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Simple Java program for Spring framework
 * @author R.GOPALAKRISHNAN
 * @author gopalakrishnanr94@gmail.com
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public final class Main

{
	
	public static void main(String args[])
	{
		DerByDao dao=new DerByDao();
		
		DriverManagerDataSource datasource=new DriverManagerDataSource();
		
		datasource.setDriverClassName("com.mysql.jdbc.Driver");
		
		datasource.setUrl("jdbc:mysql://localhost:3306/testDb");
		
		datasource.setUsername("root");
		
		datasource.setPassword("password");

		//inject
		dao.setDataSource(datasource);
		
		
		dao.create("Gopal","Krishnan");
		
		dao.create("Hari","Krishnan");
		
		dao.create("Arun", "Jose");
		
		System.out.println("Now select and list all persons");
		
		List<Person> list=dao.selectAll();
		
		for(Person my:list)
		{
			System.out.print(my.getFirstName()+" ");
			System.out.print(my.getLastName()+"\n");
		}
		
		System.out.println("Now select and list all persons with have the 1st Gopal and lastname Krishnan");
				
		list=dao.select("Arun","Jose");
		
		for(Person mx:list)
		{
			System.out.print(mx.getFirstName()+"");
			System.out.print(mx.getLastName()+"\n");
		}
		dao.deleteAll();
		
	}

}
