package com.meisw.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.meisw.service.TestService;

@Controller
public class TestCtrl {
	
	private static Logger log = Logger.getLogger(TestCtrl.class);
	
	@Autowired
	TestService tService;
	
	@RequestMapping("/test")
	@ResponseBody
	public String test(){
		log.info("ecps-portal进入controller...");
		tService.test();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = sdf.format(new Date());
		String result = "hello world! 现在是北京时间:"+date;
		log.info(result);
		return result;
	}
}
