package com.cn.hnust.service;

import java.util.List;

import com.cn.hnust.pojo.User;

public interface IUserService {
	public int deleteByPrimaryKey(Integer userid);

	public int insert(User record);

	public int insertSelective(User record);

	public List<User> selectAll();

	public User selectByPrimaryName(String name);

	public int updateByPrimaryKeySelective(User record);

	public int updateByPrimaryKey(User record);
}
