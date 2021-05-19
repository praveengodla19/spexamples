package com.example.mvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DemoController {
	
	 @RequestMapping(value="/login", method = RequestMethod.GET)
	    public String showLoginPage(){
	        return "login";
	    }
	 
	 @GetMapping("/test")
	 public String hello() {
		 return "Hello";
	 }
	 
	 @GetMapping("/test1")
	 public String hello1() {
		 return "bye";
	 }

}
