package com.cn.hnust.dao;

import java.util.List;

import com.cn.hnust.pojo.Message;

public interface MessageDao {
	int deleteByPrimaryKey(Integer mid);

	int insert(Message record);

	int insertSelective(Message record);

	List<Message> selectAll();
	
	List<Message> selectById(Integer usendid, Integer userid);

	Message selectByPrimaryKey(Integer mid);

	int updateByPrimaryKeySelective(Message record);

	int updateByPrimaryKey(Message record);
}