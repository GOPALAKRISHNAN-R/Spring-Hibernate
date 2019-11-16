package com.gk;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Confg
{
	@Bean(name="mcBean")
	public MyColor getColor()
	{
		
		return new RedColor();
	}
	

}
