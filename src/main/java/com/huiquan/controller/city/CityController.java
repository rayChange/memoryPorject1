package com.huiquan.controller.city;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.huiquan.dao.CityMapper;
import com.huiquan.entity.Home;



@RestController
@RequestMapping("city")
public class CityController {
	
	@Autowired CityMapper cityMapper;
	
	@GetMapping("/returnCity")
    public Map<String,Object> returnHome() {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("cityList", cityMapper.getCityList());
        return result;
    }
	
}
