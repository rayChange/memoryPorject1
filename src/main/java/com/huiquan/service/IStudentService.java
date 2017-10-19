package com.huiquan.service;

public interface IStudentService {
	
	void getStudentById(int id);
	
	int deleteStudentById(int id);
	
	int insertStudent(String age,String name);
	
	void throwExceptionFunction();

}
