package com.gk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Simple Java program for Spring framework
 * @author R.GOPALAKRISHNAN
 * @author gopalakrishnanr94@gmail.com
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class Main 
{

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		ApplicationContext con=new AnnotationConfigApplicationContext(Confg.class);
		
		MyColor m=(MyColor)con.getBean("mcBean");
		
		m.printColor();

	}

}
