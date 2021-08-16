package com.example.NeedwebApplication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Server;
import com.example.repositories.Usersignuprepositorie;

@RestController
public class DatabaseController
{

	@Autowired
	Usersignuprepositorie usersignuprepositorie;
	
	//creating a get mapping that retrieves all the students detail from the database 
	@GetMapping("/server")
	private List<Server> getALLServer()
	{
		return usersignuprepositorie.getALLServer ;
		
	}
	
	//creating a get mapping that retrieves the detail of a specific student
	
	@GetMapping("/server/{id}")  
	private Server getStudent(@PathVariable("id") int id)   
	{  
	return usersignuprepositorie.getStudentById(id);  
	}  
	
	
	//creating a delete mapping that deletes a specific student  
	
	@DeleteMapping("/server/{id}")  
	private void deleteStudent(@PathVariable("id") int id)   
	{  
		usersignuprepositorie.delete(id);  
	}  
	
	//creating post mapping that post the student detail in the database
	
	private int saveStudent(@RequestBody Server server)   
	{  
		usersignuprepositorie.saveOrUpdate(server);  
	return server.getId();  
	}  
	
	
}
