package com.meisw.service;

import net.sf.json.JSONObject;

/**
 * 轮播图相关服务
 * <p></p>
 * @author 梅双卫 2017年11月2日 下午12:10:49
 * @ClassName LunboService
 * @Description TODO
 * @version V1.0   
 * @modificationHistory=========================逻辑或功能性重大变更记录
 * @modify by user: {修改人} 2017年11月2日
 * @modify by reason:{方法名}:{原因}
 */
public interface LunboService {
	
	/**
	 * 轮播图添加
	 * @author 梅双卫 2017年11月2日 下午12:08:03
	 * @Method: addLunbo 
	 * @Description: TODO
	 * @param lunbo
	 * @return 
	 * @throws
	 */
	public JSONObject addLunbo(JSONObject  jsonObject);
	
	/**
	 * 轮播图列表
	 * @author 梅双卫 2017年11月2日 下午12:09:45
	 * @Method: queryLunbo 
	 * @Description: TODO
	 * @param jsonObject
	 * @return 
	 * @throws
	 */
	public JSONObject queryLunbo(JSONObject jsonObject);
	
	/**
	 * 轮播图编辑
	 * @author 梅双卫 2017年11月2日 下午12:10:17
	 * @Method: editLunbo 
	 * @Description: TODO
	 * @param jsonObject
	 * @return 
	 * @throws
	 */
	public JSONObject editLunbo(JSONObject jsonObject);
}
