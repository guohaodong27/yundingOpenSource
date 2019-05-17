package com.yunding.dao;

import com.yunding.dao.entities.User;
import com.yunding.dao.entities.UserExtend;


public interface UserDao {
    int deleteByPrimaryKey(String userId);

    int insert(UserExtend record);

    int insertSelective(UserExtend record);

    UserExtend selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(UserExtend record);

    int updateByPrimaryKeyWithBLOBs(UserExtend record);

    int updateByPrimaryKey(User record);
}