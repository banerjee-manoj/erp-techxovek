package com.techxovek.erp.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techxovek.erp.student.service.StudentRegistrationService;
import com.techxovek.erp.student.vo.StudentRegistrationVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@CrossOrigin
@Slf4j
@RequestMapping("/api/student")
public class StudentRegistrationController {
	
	
	@Autowired
	StudentRegistrationService studentRegService;
	
	
	@GetMapping("/getregisteredstudents")
	public List<StudentRegistrationVO> getAllStudents(){
		log.info("Fetch Data");
		return studentRegService.getAllStudents();
	}
	
	@PostMapping("/registernewstudent")
	public void registerNewStudent(@RequestBody StudentRegistrationVO student){
		log.info("Save Data");
		studentRegService.registerNewStudent(student);
	}
	
	

}
