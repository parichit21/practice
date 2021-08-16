package com.example.configuration;

import javax.activation.DataSource;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.repositories.Usersignuprepositorie;

@Configuration
public class SpringBeanConfig 
{
	@Autowired
	Usersignuprepositorie usersignuprepositorie;
	
	@Bean
	public DataSource dataSource() throws BeansException
	{
		DataSource dataSource = (DataSource)BeanFactory.getBean("Name");
		return dataSource;
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
