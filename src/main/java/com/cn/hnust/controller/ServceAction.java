package com.cn.hnust.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/service")
public class ServceAction {
	@RequestMapping("/getService")
	public String getService() {
		return "service";
	}
}
