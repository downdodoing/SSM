package com.cn.hnust.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.hnust.dao.ContactsDao;
import com.cn.hnust.pojo.Contacts;
import com.cn.hnust.service.IContactsService;

@Service("contactsService")
public class ContactsServiceImpl implements IContactsService {

	@Resource
	private ContactsDao contactsDao;

	@Override
	public int deleteByPrimaryKey(Integer cid) {
		return this.contactsDao.deleteByPrimaryKey(cid);
	}

	@Override
	public int insert(Contacts record) {
		return this.contactsDao.insert(record);
	}

	@Override
	public int insertSelective(Contacts record) {
		return this.contactsDao.insertSelective(record);
	}

	@Override
	public List<Contacts> selectAll() {
		return this.contactsDao.selectAll();
	}

	@Override
	public List<Contacts> selectByUserId(int userid) {
		return this.contactsDao.selectByUserId(userid);
	}

	@Override
	public Contacts selectByPrimaryKey(Integer cid) {
		return this.contactsDao.selectByPrimaryKey(cid);
	}

	@Override
	public int updateByPrimaryKeySelective(Contacts record) {
		return this.contactsDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Contacts record) {
		return this.contactsDao.updateByPrimaryKey(record);
	}
}
