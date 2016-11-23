package com.cn.hnust.service;

import java.util.List;

import com.cn.hnust.pojo.Contacts;

public interface IContactsService {
	public int deleteByPrimaryKey(Integer cid);

	public int insert(Contacts record);

	public int insertSelective(Contacts record);

	public List<Contacts> selectAll();

	// 通过userID获取好友
	public List<Contacts> selectByUserId(int userid);

	public Contacts selectByPrimaryKey(Integer cid);

	// 对字段进行判断再更新（为null则不更新）
	public int updateByPrimaryKeySelective(Contacts record);

	public int updateByPrimaryKey(Contacts record);
}
