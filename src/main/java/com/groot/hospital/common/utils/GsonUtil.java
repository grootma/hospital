package com.groot.hospital.common.utils;

import com.google.gson.Gson;

/**
 * 
 * @author groot
 *
 */
public class GsonUtil {
	
	/**
	 * 转换Json字符串为对象
	 * @param json
	 * @param
	 * @return
	 */
	public static <T> T getObjectFromJsonStr(String json, Class<T> classOfT) {
		Gson g = new Gson();
		return g.fromJson(json, classOfT);
	}
	
	public static String getJsonStringFromObject(Object obj) {
		Gson gson = new Gson();
		return gson.toJson(obj);
	}
}
