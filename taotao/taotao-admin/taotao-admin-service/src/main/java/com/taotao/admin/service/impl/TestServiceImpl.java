package com.taotao.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.admin.mapper.TestMapper;
import com.taotao.admin.service.TestService;

/**
 * 服务接口实现类
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2018年3月10日 下午6:30:45
 * @version 1.0
 */
@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	private TestMapper testMapper;
	
	@Override
	public String queryCurrentDate() {
		return testMapper.queryDate();
	}
}