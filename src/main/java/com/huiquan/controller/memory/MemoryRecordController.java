package com.huiquan.controller.memory;

import java.util.Date;
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

import com.feilong.core.bean.BeanUtil;
import com.huiquan.dao.StudentMapper;
import com.huiquan.entity.MemoryRecord;
import com.huiquan.service.IMemoryRecordService;
import com.huiquan.service.IStudentService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;



@RestController
@RequestMapping("memory")
public class MemoryRecordController {
	
	@Autowired IMemoryRecordService memoryRecordService;
	
	@PostMapping("/insertMemory")
	public Map<String,Object> insertStudent(@RequestBody Map<String,Object> param){
		Map<String,Object> result = new HashMap<String, Object>();
		result.put("param", param);
		if(null != param && null != param.get("userId") && null != param.get("isSuccess")){
			MemoryRecord memoryRecord = new MemoryRecord();
			BeanUtil.copyProperties(memoryRecord, param,"userId","isSuccess","randomNum","inputNum");
			memoryRecord.setTsp(new Date());
			memoryRecordService.insert(memoryRecord);
		}
		return result;
	}
	
}
