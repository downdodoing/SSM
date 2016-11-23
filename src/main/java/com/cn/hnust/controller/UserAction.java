package com.cn.hnust.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cn.hnust.json.UserJson;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserAction {
	@Resource
	private IUserService userService;

	@RequestMapping("/register")
	@ResponseBody
	public String register(HttpServletRequest req) {

		int flag = 0;

		String jsonUser = req.getParameter("user");
		JSONObject joo = JSON.parseObject(jsonUser);
		User user = UserJson.jsontoUser(joo);

		flag = userService.insert(user);
		if (flag > 0) {
			return "成功";
		} else {
			return "失败";
		}

	}

	@RequestMapping("/login")
	@ResponseBody
	public String login(HttpServletRequest req) {
		System.out.println("连接成功");
		return "连接成功";
	}
}
