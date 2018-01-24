package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	//Need controller method to show initial HTML form 
	@RequestMapping("/showForm")
	public String showForm ()
	{
		return "helloworld-form" ;
	}
	
	//Need controller method to process form
	@RequestMapping("/processForm")
	public String processForm ()
	{
		return "helloworld" ;
	}
	
	//need controller method to read form data and add data to model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request , Model model )
	{
		//read request parameter from HTML form
		String theName= request.getParameter("studentName");
		
		//convert it to Upeer case
		theName= theName.toUpperCase();
		
		//Create message
		String result = "Yo ! " + theName ;
		
		//Add it to model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}









