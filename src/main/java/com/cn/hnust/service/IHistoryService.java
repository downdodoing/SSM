package com.cn.hnust.service;

import java.util.List;

import com.cn.hnust.pojo.History;

public interface IHistoryService {
	public int deleteByPrimaryKey(Integer hid);

	public int insert(History record);

	public int insertSelective(History record);

	public List<History> selectAll();

	// 通过userId和cId获取与好友的历史消息
	public List<History> selectByUserIdAndCId(int userid, int cid);

	public History selectByPrimaryKey(Integer hid);

	public int updateByPrimaryKeySelective(History record);

	public int updateByPrimaryKey(History record);
}
