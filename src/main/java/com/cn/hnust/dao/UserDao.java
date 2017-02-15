package com.cn.hnust.dao;

import java.util.List;

import com.cn.hnust.pojo.User;

public interface UserDao {
	int deleteByPrimaryKey(Integer userid);

	int insert(User record);

	int insertSelective(User record);

	List<User> selectAll();

	User selectByPrimaryName(String name);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);
}