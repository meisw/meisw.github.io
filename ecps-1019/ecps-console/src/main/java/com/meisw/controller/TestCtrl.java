package com.meisw.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.meisw.service.TestService;

@Controller
@RequestMapping("/test")
public class TestCtrl {
	
	private static Logger log = Logger.getLogger(TestCtrl.class);
	
	@Autowired
	TestService tsService;
	
	@RequestMapping(value="/a1",method=RequestMethod.GET)
	@ResponseBody
	public String test(){
		log.info("进入controller层...");
		tsService.test();
		return "hello world! "+new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date());
	}
}
