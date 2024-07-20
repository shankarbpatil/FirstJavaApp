package com.welcome.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	 @GetMapping("/hello")
	    public String welcome() {
	        return "Welcome to the new world, " ;
	    }
	    
	
    @GetMapping("/welcome/{name}")
    public String addwelcome(@PathVariable String name) {
        return "Welcome to the new world, " + name;
    }
    
    
}
