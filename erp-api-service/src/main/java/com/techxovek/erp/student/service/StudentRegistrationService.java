package com.techxovek.erp.student.service;

import java.util.List;

import com.techxovek.erp.student.vo.StudentRegistrationVO;

public interface StudentRegistrationService {
	
	public List<StudentRegistrationVO> getAllStudents();
	public void registerNewStudent(StudentRegistrationVO student);

}
