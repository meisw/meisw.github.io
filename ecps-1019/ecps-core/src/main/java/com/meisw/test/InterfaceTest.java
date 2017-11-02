package com.meisw.test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

import net.sf.json.JSONObject;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.meisw.po.User;
import com.meisw.service.LunboService;
import com.meisw.service.TestService;

/**
 * 接口测试类
 * <p>
 * </p>
 * @author 梅双卫 2017年11月1日 下午3:36:51
 * @ClassName InterfaceTest
 * @Description TODO
 * @version V1.0
 * @modificationHistory=========================逻辑或功能性重大变更记录
 * @modify by user: {修改人} 2017年11月1日
 * @modify by reason:{方法名}:{原因}
 */
public class InterfaceTest {
	
	private static TestService tService;
	private static LunboService lbService;
	
	@BeforeClass
	public static void init() {
		ApplicationContext ct = new ClassPathXmlApplicationContext("applicationContext.xml");
		tService = (TestService)ct.getBean("TestService");
		lbService = (LunboService)ct.getBean("lunboService");
	}
	
	@Test
	public void test1() {
		System.out.println("-------");
		tService.test();
		System.out.println("*********");
	}
	
	@Test
	public void test2(){
		User user = new User();
		user.setCorp("corp");
		user.setUsername("liberay");
		tService.add(user);
	}
	
	@Test
	public void test3(){
		JSONObject json = new JSONObject();
		Map<String,String> map = new HashMap<String,String>();
		map = new Hashtable<String,String>();
		map = new TreeMap<String,String>();
		json.put("link", "www.baidu.com");
		json.put("picName", "zzzz.png");
		json.put("title", "学前教育");
		json.put("url", "club.mail.wo.cn");
		lbService.addLunbo(json);
	}
}
