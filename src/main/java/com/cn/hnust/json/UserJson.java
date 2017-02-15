package com.cn.hnust.json;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;

public class UserJson {
	private IUserService userService;

	public UserJson(IUserService userService) {
		this.userService = userService;
	}

	public User jsontoUser(JSONObject joo) {

		User user = new User();
		user.setName(getRandomNumber() + "");

		if (null != joo.getInteger("age")) {
			user.setAge(joo.getInteger("age"));
		} else {
			user.setAge(0);
		}

		if (null != joo.getString("sex")) {
			user.setSex(joo.getString("sex"));
		} else {
			user.setSex("");
		}

		if (null != joo.getString("area")) {
			user.setArea(joo.getString("area"));
		} else {
			user.setArea("");
		}

		if (null != joo.getString("password")) {
			user.setPassword(joo.getString("password"));
		} else {
			user.setPassword("12345678");
		}

		if (null != joo.getString("phoneNum")) {
			user.setPhonenum(joo.getString("phoneNum"));
		} else {
			user.setPhonenum("");
		}

		if (null != joo.getString("netName")) {
			user.setNetname(joo.getString("netName"));
		} else {
			user.setNetname("");
		}

		if (null != joo.getString("signature")) {
			user.setSignature(joo.getString("signature"));
		} else {
			user.setSignature("编辑个性签名");
		}
		if (null != joo.getString("isOnline")) {
			user.setIsonline(Integer.parseInt(joo.getString("isOnline")));
		} else {
			user.setIsonline(0);
		}

		if (null != joo.getString("remarks")) {
			user.setRemarks(joo.getString("remarks"));
		} else {
			user.setRemarks("");
		}
		user.setHeadphoto("");

		return user;
	}

	public int getRandomNumber() {
		List<User> users = userService.selectAll();
		int number = (int) ((Math.random()) * (1e9 - 1e5) + 1e5);
		int length = users.size();
		for (int i = 0; i < length; i++) {
			if (number == Integer.parseInt(users.get(i).getName())) {
				number = (int) ((Math.random()) * (1e9 - 1e5) + 1e5);
				// 重新开始查找
				i = -1;
			}
		}
		return number;
	}
}
