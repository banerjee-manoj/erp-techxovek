package com.techxovek.erp.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techxovek.erp.student.dao.StudentRegistrationDao;
import com.techxovek.erp.student.vo.StudentRegistrationVO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class StudentRegistrationServiceImpl implements StudentRegistrationService{
	
	@Autowired
	StudentRegistrationDao studentRegDao;
	
	
	
	@Override
	public List<StudentRegistrationVO> getAllStudents() {
		log.info("Fetch All students");
		return studentRegDao.getAllStudents();
		
	}

	@Override
	public void registerNewStudent(StudentRegistrationVO student) {
		log.info("Register New Student");
		 studentRegDao.registerStudent(student);
		
	}

}
