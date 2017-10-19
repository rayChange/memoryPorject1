package com.huiquan.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.huiquan.entity.Student;
@Component
public interface StudentMapper extends BaseMapper<Student>{
	
	@Select("select * from student where id = #{id}")
	public Student getStudentById(int id);
	
	@Update("update student set name = #{name} where id = #{id}")
	int updateNameById(@Param("name") String name,@Param("id")int id);
	
	@Delete("delete from student where id = #{id}")
	int deleteStudentById(@Param("id")int id);
	
	int insertStudent(@Param("age") String age,@Param("name") String name);

}
