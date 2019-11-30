package com.techxovek.erp.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;


/**
 * This Class is created primarily for the 
 * login/logout activities for the erp solution.
 * 
 * @author Manoj
 *
 */



@RestController
@CrossOrigin
@Slf4j
public class LoginController {
	
	
	/**
	 * Test method..
	 * @return {@link: String }
	 */
	@GetMapping("/testmethod")
	public String testMethod(){
		log.debug("This is a test method..");
		log.info("This is test info logger...");
		return "This is sample test method..";
				
	}
	
	
	
	

}
