package com.techxovek.erp.student.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.techxovek.erp.student.vo.StudentRegistrationVO;

public class StudentRegistrationMapper implements RowMapper<StudentRegistrationVO>{

	@Override
	public StudentRegistrationVO mapRow(ResultSet rs, int arg1) throws SQLException {
		StudentRegistrationVO student = new StudentRegistrationVO();
		student.setStudent_name(rs.getString(1));
		student.setDepartment(rs.getString(2));
		
		
		
		return student;
	}

}
