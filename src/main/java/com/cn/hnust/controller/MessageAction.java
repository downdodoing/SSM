package com.cn.hnust.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.hnust.service.IMessageService;

@Controller
@RequestMapping("/message")
public class MessageAction {

	@Resource
	private IMessageService messageService;
}
