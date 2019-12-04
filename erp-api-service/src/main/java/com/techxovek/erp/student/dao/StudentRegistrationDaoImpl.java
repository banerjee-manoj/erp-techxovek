package com.techxovek.erp.student.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.techxovek.erp.student.mapper.StudentRegistrationMapper;
import com.techxovek.erp.student.vo.StudentRegistrationVO;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class StudentRegistrationDaoImpl implements StudentRegistrationDao{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	Environment env;

	@Override
	public List<StudentRegistrationVO> getAllStudents() {
		
		log.info("Begin : getAllStudents");
		String query = env.getProperty("showAllRegisteredStudents");
		List<StudentRegistrationVO> regStudentList = new ArrayList<>();
		regStudentList =jdbcTemplate.query(query,new StudentRegistrationMapper());
		log.info("END :getAllRegStudents total Number: %s",regStudentList.size());
		return regStudentList;
	}

	@Override
	public void registerStudent(StudentRegistrationVO student) {
		
		   log.info("Begin : registerStudent()");
		 	String query = env.getProperty("registerStudent");
			jdbcTemplate.update(query, student.getStudent_name(),student.getDepartment(),student.getAdmissionYear(),
					student.getEmail(),student.getContactNo(),student.getAddress());
			log.info("END: registerStudent()");
	}

}
