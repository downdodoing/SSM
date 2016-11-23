package com.cn.hnust.service;

import java.util.List;

import com.cn.hnust.pojo.Group;

public interface IGroupService {
	public int deleteByPrimaryKey(Integer groupid);

	public int insert(Group record);

	public int insertSelective(Group record);

	public List<Group> selectAll();

	public List<Group> selectByUserId(int userid);

	public Group selectByPrimaryKey(Integer groupid);

	public int updateByPrimaryKeySelective(Group record);

	public int updateByPrimaryKey(Group record);
}
