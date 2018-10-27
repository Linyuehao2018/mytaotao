package com.taotao.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taotao.admin.service.TestService;

/**
 * TestController
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2018年3月10日 下午6:25:08
 * @version 1.0
 */
@RestController
public class TestController {
	
	/** 注入服务接口代理对象 */
	@Autowired
	private TestService testService;
	
	@GetMapping("/date")
	public String queryCurrentDate(){
		System.out.println("testService:" + testService);
		return testService.queryCurrentDate();
	}
}
