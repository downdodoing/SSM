package com.cn.hnust.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.hnust.dao.HistoryDao;
import com.cn.hnust.pojo.History;
import com.cn.hnust.service.IHistoryService;

@Service("historyService")
public class HistoryServiceImp implements IHistoryService {

	@Resource
	private HistoryDao historyDao;

	@Override
	public int deleteByPrimaryKey(Integer hid) {
		return this.historyDao.deleteByPrimaryKey(hid);
	}

	@Override
	public int insert(History record) {
		return this.historyDao.insert(record);
	}

	@Override
	public int insertSelective(History record) {
		return this.historyDao.insertSelective(record);
	}

	@Override
	public List<History> selectAll() {
		return this.historyDao.selectAll();
	}

	@Override
	public List<History> selectByUserIdAndCId(int userid, int cid) {
		return this.historyDao.selectByUserIdAndCId(userid, cid);
	}

	@Override
	public History selectByPrimaryKey(Integer hid) {
		return this.historyDao.selectByPrimaryKey(hid);
	}

	@Override
	public int updateByPrimaryKeySelective(History record) {
		return this.historyDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(History record) {
		return this.historyDao.updateByPrimaryKey(record);
	}

}
