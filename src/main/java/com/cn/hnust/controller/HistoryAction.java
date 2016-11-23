package com.cn.hnust.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.hnust.service.IHistoryService;

@Controller
@RequestMapping("/history")
public class HistoryAction {

	@Resource
	private IHistoryService hsitoryService;
}
