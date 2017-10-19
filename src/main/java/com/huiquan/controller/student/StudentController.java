package com.huiquan.controller.student;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.huiquan.dao.StudentMapper;
import com.huiquan.service.IStudentService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;



@RestController
@RequestMapping("student")
public class StudentController {
	
	@Autowired StudentMapper studentMapper;
	
	@Autowired IStudentService studentService;
	
	
	@ApiOperation("查询学生信息")  
    @ApiImplicitParams({  
        @ApiImplicitParam(paramType="query",name="id",dataType="String",required=true,value="id",defaultValue="3"),  
    })  
	@GetMapping("/getStudentById/{id}")
    public Map<String,Object> returnHome(@PathVariable("id")int id) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("student", studentMapper.getStudentById(id));
        return result;
    }
	
	@PostMapping("/updateName")
	public Map<String,Object> updateName(@RequestBody Map<String,Object> param){
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("param", param);
		if(null != param && null != param.get("name") && null != param.get("id")){
			String name = param.get("name").toString();
			int id = Integer.valueOf(param.get("id").toString());
			studentMapper.updateNameById(name, id);
		}
		return map;
	}
	
	@DeleteMapping("/deleteStudentById")
	public Map<String,Object> deleteStudentById(@RequestBody Map<String,Object> param){
		Map<String,Object> result = new HashMap<String,Object>();
		result.put("param", param);
		if(null != param && null !=param.get("id")){
			int id = Integer.valueOf(param.get("id").toString());
			studentService.deleteStudentById(id);
		}
		return result;
	}
	
	@PutMapping("/insertStudent")
	public Map<String,Object> insertStudent(@RequestBody Map<String,Object> param){
		Map<String,Object> result = new HashMap<String, Object>();
		result.put("param", param);
		if(null != param && null != param.get("age") && null != param.get("name")){
			String age = param.get("age").toString();
			String name = param.get("name").toString();
			studentService.insertStudent(age, name);
		}
		return result;
	}
	
}
