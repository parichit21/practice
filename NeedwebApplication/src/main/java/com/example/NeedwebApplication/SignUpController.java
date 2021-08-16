package com.example.NeedwebApplication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//import com.example.model.User;

@Controller
public class SignUpController {

	@RequestMapping("/Signupform")
	public String registrationform()
	{
		return "Signupform.html";
		
	}
	//handler for signup form 
//	@RequestMapping(path="/processform",method = RequestMethod.POST) //it will call only when path is processform and request method is post
	/*
	 * public String handleform(
	 * 
	 * @RequestParam("email") String useremail,
	 * 
	 * @RequestParam("password") String password ,
	 * 
	 * @RequestParam("confirm_password") String confirm_password , Model model)
	 */ //creating variable for holding values
	
	//public String handleform(@ModelAttribute User user , Model model)
	//@model attribute reduces the work by automatically creatiiong object(user) and the store it in mode
	//it reduces 
	//requestparam
	//reduces object which we created 
	//reduces model which we created
//	{
//		System.out.println(user);
//		return "home.html";
		/* User user = new User(); */
		/*
		 * user.setEmail(useremail); user.setPassword(password);
		 * user.setConfirm_password(confirm_password)
		 */
		
		
		//model.addAttribute("user",user);
		
		
//	}
	
}
