package com.cn.hnust.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.hnust.dao.UserDao;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;

@Service("userService")
public class UserServiceImp implements IUserService {
	@Resource
	private UserDao userDao;

	@Override
	public int deleteByPrimaryKey(Integer userid) {
		return this.userDao.deleteByPrimaryKey(userid);
	}

	@Override
	public int insert(User record) {
		return this.userDao.insert(record);
	}

	@Override
	public int insertSelective(User record) {
		return this.userDao.insertSelective(record);
	}

	@Override
	public List<User> selectAll() {
		return this.userDao.selectAll();
	}

	@Override
	public User selectByPrimaryName(String name) {
		return this.userDao.selectByPrimaryName(name);
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		return this.userDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(User record) {
		return this.userDao.updateByPrimaryKey(record);
	}
}
