package com.huiquan.controller.world;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.huiquan.entity.Home;



@RestController
@RequestMapping("world")
public class WorldController {
	
	
	@GetMapping("/returnHome")
    public Home returnHome() {
		Home home = new Home();
		home.setAddress("北京市琉璃个胡同");
		home.setName("四合院");
        return home;
    }
	
}
