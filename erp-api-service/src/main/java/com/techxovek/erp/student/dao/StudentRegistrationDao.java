package com.techxovek.erp.student.dao;


import java.util.List;

import com.techxovek.erp.student.vo.StudentRegistrationVO;

public interface StudentRegistrationDao {

	
	public List<StudentRegistrationVO> getAllStudents();
	
	public void registerStudent(StudentRegistrationVO student);
	
}
