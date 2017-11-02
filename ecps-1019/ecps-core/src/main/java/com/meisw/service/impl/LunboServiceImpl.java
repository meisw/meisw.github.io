package com.meisw.service.impl;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meisw.dao.LunboMapper;
import com.meisw.po.Lunbo;
import com.meisw.service.LunboService;
import com.meisw.util.Constants;

@Service("lunboService")
public class LunboServiceImpl implements LunboService {
	
	private static Logger log = Logger.getLogger(LunboServiceImpl.class);
	
	@Autowired
	LunboMapper lbDao;
	
	public JSONObject addLunbo(JSONObject jsonObject) {
		log.info("轮播图添加操作入参：" + jsonObject);
		String methodName = this.getClass().getName()+"----> addLunbo";
		Lunbo lb = new Lunbo();
		JSONObject json = new JSONObject();
		if (jsonObject.containsKey("link") && jsonObject.getString("link") != null && jsonObject.getString("link").length() > 0)
			lb.setLink(jsonObject.getString("link"));
		else
			return errorInfo("link参数缺失", Constants.MISSPARAMS,methodName);
		
		if (jsonObject.containsKey("picName") && jsonObject.getString("picName") != null && jsonObject.getString("picName").length() > 0)
			lb.setPicName(jsonObject.getString("picName"));
		else
			return errorInfo("picName参数缺失", Constants.MISSPARAMS,methodName);
		
		if (jsonObject.containsKey("title") && jsonObject.getString("title") != null && jsonObject.getString("title").length() > 0){
			lb.setTitle(jsonObject.getString("title"));
		}else{
			return errorInfo("title参数缺失", Constants.MISSPARAMS,methodName);
		}
		if (jsonObject.containsKey("url") && jsonObject.getString("url") != null && jsonObject.getString("url").length() > 0){
			lb.setUrl(jsonObject.getString("url"));
		}else{
			return errorInfo("url参数缺失", Constants.MISSPARAMS,methodName);
		}
		int count = lbDao.insert(lb);
		log.info("lunbo:"+lb);
		if(count>0){
			json.put("code", Constants.SUCCESS);
			json.put("info", "轮播图添加成功");
		}else{
			return errorInfo("服务器异常", Constants.SERVER_ERROR,methodName);
		}
		return json;
	}
	
	public JSONObject queryLunbo(JSONObject jsonObject) {
		/** TODO Auto-generated method stub */
		return null;
	}
	
	public JSONObject editLunbo(JSONObject jsonObject) {
		/** TODO Auto-generated method stub */
		return null;
	}
	
	private JSONObject errorInfo(String info, String code,String methodName) {
		JSONObject js = new JSONObject();
		js.put("code", code);
		js.put("errorMessage", info);
		log.info("错误信息："+js+",methodName="+methodName);
		return js;
	}
}
