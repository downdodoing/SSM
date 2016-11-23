package com.cn.hnust.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.hnust.service.IGroupService;

@Controller
@RequestMapping("group")
public class GroupAction {

	@Resource
	private IGroupService groupService;
}
