package com.techxovek.erp.common.service;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class LoginServiceImpl implements LoginService{

	@Override
	public boolean validateUser() {
		log.debug("inside the validate user");
		return false;
	}
	
	

}
