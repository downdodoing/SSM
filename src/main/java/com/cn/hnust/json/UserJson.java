package com.cn.hnust.json;

import com.alibaba.fastjson.JSONObject;
import com.cn.hnust.pojo.User;

public class UserJson {
	public static User jsontoUser(JSONObject joo) {
		
		User user = new User();
		user.setName(joo.getString("name"));
		user.setAge(joo.getInteger("age"));
		user.setSex(joo.getString("sex"));
		user.setArea(joo.getString("age"));
		user.setPassword(joo.getString("password"));
		user.setPhonenum(joo.getString("phoneNum"));
		user.setNetname(joo.getString("netName"));
		user.setSignature(joo.getString("signature"));
		
		return user;
	}
}
