package com.huiquan.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huiquan.dao.StudentMapper;
import com.huiquan.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService{
	
	@Autowired private StudentMapper studentMapper;

	@Override
	public void getStudentById(int id) {
		studentMapper.getStudentById(id);
	}

	@Override
	public int deleteStudentById(int id) {
		return studentMapper.deleteStudentById(id);
	}

	@Override
	public int insertStudent(String age, String name) {
		return studentMapper.insertStudent(age, name);
	}

	@Override
	public void throwExceptionFunction() {
		throw new RuntimeException();
	}
	
	
	
}
