package com.cn.hnust.dao;

import java.util.List;

import com.cn.hnust.pojo.History;

public interface HistoryDao {
	int deleteByPrimaryKey(Integer hid);

	int insert(History record);

	int insertSelective(History record);

	List<History> selectAll();

	// 通过userId和cId获取与好友的历史消息
	List<History> selectByUserIdAndCId(int userid, int cid);

	History selectByPrimaryKey(Integer hid);

	int updateByPrimaryKeySelective(History record);

	int updateByPrimaryKey(History record);
}