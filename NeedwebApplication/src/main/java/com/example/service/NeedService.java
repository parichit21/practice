package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Server;
import com.example.repositories.Usersignuprepositorie;

@Service
public class NeedService {

@Autowired
	Usersignuprepositorie usersignuprepositorie;
	
	public List <Server> getALLServer()
	{
		
		List<Server> students = new ArrayList<Server>();  
		usersignuprepositorie.findAll().forEach(Server -> students.add(Server));  
		return students;  
	}
	
	
	//getting a specific record
	public Server getServerById(int id)
	{
		return usersignuprepositorie.findById(id).get();
		
	}
	
	
	
	//save record
	public void saveOrUpdate(Server server)
	{
		usersignuprepositorie.save(server);
	}
	
	
	
	
	//delete record 
	public void delete(int id)
	{
		usersignuprepositorie.deleteById(id);
	}
	
	
	
	
	
	
	
}
