package com.gk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gk.config.SpringJdbcConfiguration;
import com.gk.dao.DaoImpl;

/**
 * Simple Java program for Spring framework
 * @author R.GOPALAKRISHNAN
 * @author gopalakrishnanr94@gmail.com
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class App 
{

	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringJdbcConfiguration.class);
		
		DaoImpl dao=context.getBean(DaoImpl.class);
		
		String name=dao.getEmployeeName(101);
		
		System.out.println("Employee name is "+name);
		
		context.close();

	}

}
