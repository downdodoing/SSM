package com.cn.hnust.service;

import java.util.List;

import com.cn.hnust.pojo.Message;

public interface IMessageService {
	int deleteByPrimaryKey(Integer mid);

	int insert(Message record);

	int insertSelective(Message record);

	List<Message> selectAll();

	List<Message> selectById(Integer usendid, Integer userid);

	Message selectByPrimaryKey(Integer mid);

	int updateByPrimaryKeySelective(Message record);

	int updateByPrimaryKey(Message record);
}
