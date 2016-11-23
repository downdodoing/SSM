package com.cn.hnust.dao;

import java.util.List;

import com.cn.hnust.pojo.Group;

public interface GroupDao {
    int deleteByPrimaryKey(Integer groupid);

    int insert(Group record);
    
    int insertSelective(Group record);
    
    List<Group> selectAll();
    
    List<Group> selectByUserId(int userid);
    
    Group selectByPrimaryKey(Integer groupid);

    int updateByPrimaryKeySelective(Group record);

    int updateByPrimaryKey(Group record);
}