package com.gk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Simple Java program for Spring framework
 * @author R.GOPALAKRISHNAN
 * @author rgopalakrishnanmca@gmail.com
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class Main 
{

	public static void main(String[] args) 
	{
			@SuppressWarnings("resource")
			ApplicationContext context= new AnnotationConfigApplicationContext(Confg.class);
			
			TvsXl a=context.getBean(TvsXl.class);
			
			a.setGearType("Without geartype");
			
			a.getGearType();
			
			TvsApache b=context.getBean(TvsApache.class);
			
			b.setGearType("5 gearType");
			
			b.getGearType();
			
			R15 c=context.getBean(R15.class);
			
			c.setGearType("6 gearType");
			
			c.getGearType();

	}

}
