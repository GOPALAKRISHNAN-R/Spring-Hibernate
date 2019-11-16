package com.gk.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.gk.dao.DaoImpl;
import com.gk.dao.IDao;


@Configuration
public class SpringJdbcConfiguration
{
	@Bean
	public IDao employeeDao()
	{
		DaoImpl empDao=new DaoImpl();
		empDao.setJdbcTemplate(jdbcTemplate());
		return empDao;
	}

	@Bean
	public JdbcTemplate jdbcTemplate()
	{
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource());
		return jdbcTemplate;
	}
	
	@Bean
	public DataSource dataSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/testdb");
		dataSource.setUsername("root");
		dataSource.setPassword("password");
		return dataSource;
	}
}
