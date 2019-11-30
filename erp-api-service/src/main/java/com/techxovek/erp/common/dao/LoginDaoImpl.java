package com.techxovek.erp.common.dao;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class LoginDaoImpl implements LoginDao{

	@Override
	public boolean isValidUser() {
	log.debug("Inside isValidUser.. ");
		return false;
	}

}
