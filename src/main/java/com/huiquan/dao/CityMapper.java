package com.huiquan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.huiquan.entity.City;
import com.huiquan.entity.Student;

@Component
public interface CityMapper extends BaseMapper<City>{
	
	@Select("select * from city limit 10")
	List<City> getCityList();
}
