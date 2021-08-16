package com.example.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Repository;

import com.example.model.Server;

@Repository

public interface Usersignuprepositorie extends CrudRepository<Server, Integer> 
{

	List<Server> getALLServer = null;

	Server getStudentById(int id);

	void delete(int id);

	void saveOrUpdate(Server server);

//	void save(Server server);
	
	
	
	
	

}
