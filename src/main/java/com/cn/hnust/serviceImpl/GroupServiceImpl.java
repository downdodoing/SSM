package com.cn.hnust.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.hnust.dao.GroupDao;
import com.cn.hnust.pojo.Group;
import com.cn.hnust.service.IGroupService;

@Service("groupService")
public class GroupServiceImpl implements IGroupService {

	@Resource
	private GroupDao groupDao;

	@Override
	public int deleteByPrimaryKey(Integer groupid) {
		return this.groupDao.deleteByPrimaryKey(groupid);
	}

	@Override
	public int insert(Group record) {
		return this.groupDao.insert(record);
	}

	@Override
	public int insertSelective(Group record) {
		return this.groupDao.insertSelective(record);
	}

	@Override
	public List<Group> selectAll() {
		return this.groupDao.selectAll();
	}

	@Override
	public List<Group> selectByUserId(int userid) {
		return this.groupDao.selectByUserId(userid);
	}

	@Override
	public Group selectByPrimaryKey(Integer groupid) {
		return this.groupDao.selectByPrimaryKey(groupid);
	}

	@Override
	public int updateByPrimaryKeySelective(Group record) {
		return this.groupDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Group record) {
		return this.groupDao.updateByPrimaryKey(record);
	}
}
