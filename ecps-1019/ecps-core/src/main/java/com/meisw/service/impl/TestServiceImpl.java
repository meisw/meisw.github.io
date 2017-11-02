package com.meisw.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meisw.dao.UserMapper;
import com.meisw.po.User;
import com.meisw.service.TestService;

@Service("TestService")
public class TestServiceImpl implements TestService {
	
	private static Logger log = Logger.getLogger(TestServiceImpl.class);
	
	@Autowired
	private UserMapper userDao;
	
	public void test() {
		log.info("进入dao层");
		User user = userDao.selectByPrimaryKey(1);
		log.info("User的详细信息：" + user);
	}
	
	public void add(User user) {
		int count = userDao.insert(user);
		if (count < 1)
			log.info("数据插入失败！");
		else
			log.info("");
		
	}
	
}
