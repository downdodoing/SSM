package com.cn.hnust.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import sun.misc.BASE64Decoder;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cn.hnust.json.UserJson;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;
import com.cn.hnust.util.getandsavepicture.GetAndSavePicture;

@Controller
@RequestMapping("/user")
public class UserAction {
	@Resource
	private IUserService userService;
	private File file;

	private static final String FOLDER = "F:\\web编程\\SSM\\picture\\";

	@RequestMapping("/register")
	@ResponseBody
	public JSONObject register(HttpServletRequest req) {

		int flag = 0;
		String jsonUser = req.getParameter("user");
		JSONObject joo = JSON.parseObject(jsonUser);
		// 获取头像图片
		String head_photo = joo.getString("head_photo");

		User user = (new UserJson(userService)).jsontoUser(joo);
		GetAndSavePicture.savePicture(FOLDER, user.getName(),head_photo);

		user.setHeadphoto(file.getPath());
		flag = userService.insert(user);

		JSONObject jooo = new JSONObject();
		if (flag > 0) {
			jooo.put("name", user.getName());
			jooo.put("flag", "SUCCESS");
		} else {
			jooo.put("flag", "FAILED");
		}
		return jooo;
	}

	@RequestMapping("/login")
	@ResponseBody
	public int login(HttpServletRequest req) {
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		User user = userService.selectByPrimaryName(name);
		if (null != user) {
			if (password.equals(user.getPassword())) {
				return 2;
			} else {
				return 1;
			}
		} else {
			return 0;
		}
	}

	@RequestMapping("/getUser")
	@ResponseBody
	public JSONObject getUser(HttpServletRequest req) {
		String name = req.getParameter("name");
		User user = userService.selectByPrimaryName(name);

		JSONObject joo = (JSONObject) JSON.toJSON(user);
		joo.put("photo", GetAndSavePicture.getPicture(FOLDER, name));
		return joo;
	}

}
