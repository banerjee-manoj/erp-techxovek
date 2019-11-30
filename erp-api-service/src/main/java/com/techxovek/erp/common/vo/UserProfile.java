package com.techxovek.erp.common.vo;

import java.util.List;

import lombok.Data;

@Data
public class UserProfile {
	
	private String userId;
	private String firstName;
	private String lastName;
	private List<String> roles;

}
