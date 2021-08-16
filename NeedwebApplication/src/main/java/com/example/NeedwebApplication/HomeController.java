package com.example.NeedwebApplication;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.repositories.Usersignuprepositorie;


@Controller

public class HomeController {

	/*
	 * @Autowired NeedwebApplication needwebapplication;
	 */
	
//	@RequestMapping("/index")
//
//	public String hello()
//	  {
//	return "index.html ";
//	}
//
	@Autowired
	Usersignuprepositorie usersignuprepositorie;
@GetMapping("/home")
	public String home()
	{
		
		return "home.html";
		
	}

//	@GetMapping("/formfill")
//	public String form()
//	{
//	return "form.html"	;
//	}
//	









}
