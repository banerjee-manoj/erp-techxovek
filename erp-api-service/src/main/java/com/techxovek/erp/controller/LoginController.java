package com.techxovek.erp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techxovek.erp.common.service.LoginService;

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
	
	@Autowired
    LoginService loginService;	
	
	
	/**
	 * Test method..
	 * @return {@link: String }
	 */
	@GetMapping("/testmethod")
	public String testMethod(){
		log.debug("This is a test method..");
		log.info("This is test info logger...");
		loginService.validateUser();
		
		return "This is sample test method..";
				
	}
	
	
	
	

}
