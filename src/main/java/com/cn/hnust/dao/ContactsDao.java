package com.cn.hnust.dao;

import java.util.List;

import com.cn.hnust.pojo.Contacts;

public interface ContactsDao {
	int deleteByPrimaryKey(Integer cid);

	int insert(Contacts record);

	int insertSelective(Contacts record);

	List<Contacts> selectAll();

	// 通过userID获取好友
	List<Contacts> selectByUserId(int userid);

	List<Contacts> selectByUserIdAndGroupId(int userid, int groupid);

	Contacts selectByPrimaryKey(Integer cid);

	// 对字段进行判断再更新（为null则不更新）
	int updateByPrimaryKeySelective(Contacts record);

	int updateByPrimaryKey(Contacts record);
}