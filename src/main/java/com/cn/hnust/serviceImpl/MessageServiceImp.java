package com.cn.hnust.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.hnust.dao.MessageDao;
import com.cn.hnust.pojo.Message;
import com.cn.hnust.service.IMessageService;

@Service("messageService")
public class MessageServiceImp implements IMessageService {

	@Resource
	private MessageDao messageDao;

	@Override
	public int deleteByPrimaryKey(Integer mid) {
		return this.messageDao.deleteByPrimaryKey(mid);
	}

	@Override
	public int insert(Message record) {
		return this.messageDao.insert(record);
	}

	@Override
	public int insertSelective(Message record) {
		return this.messageDao.insertSelective(record);
	}

	@Override
	public List<Message> selectAll() {
		return this.messageDao.selectAll();
	}

	@Override
	public List<Message> selectById(Integer usendid, Integer userid) {
		return this.messageDao.selectById(usendid, userid);
	}

	@Override
	public Message selectByPrimaryKey(Integer mid) {
		return this.messageDao.selectByPrimaryKey(mid);
	}

	@Override
	public int updateByPrimaryKeySelective(Message record) {
		return this.messageDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Message record) {
		return this.messageDao.updateByPrimaryKey(record);
	}

}
