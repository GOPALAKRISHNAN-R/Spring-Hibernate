package com.gk;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Confg
{
	@Bean
	public TvsXl a()
	{
		return new TvsXl();
	}
	
	@Bean
	public TvsApache b()
	{
		return new TvsApache();
	}
	
	@Bean
	public R15 c()
	{
		return new R15();
	}

}
