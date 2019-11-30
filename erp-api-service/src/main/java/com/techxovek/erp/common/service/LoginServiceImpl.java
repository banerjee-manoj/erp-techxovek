package com.techxovek.erp.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.techxovek.erp.common.dao.LoginDao;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class LoginServiceImpl implements LoginService{

	
	@Autowired
	LoginDao loginDao;
	
	
	
	@Override
	public boolean validateUser() {
		log.debug("inside the validate user");
		loginDao.isValidUser();
		
		
		
		return false;
	}
	
	

}
