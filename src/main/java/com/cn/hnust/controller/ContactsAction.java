package com.cn.hnust.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.hnust.service.IContactsService;

@Controller
@RequestMapping("/contacts")
public class ContactsAction {
	@Resource
	private IContactsService contactsServide;
	
}
