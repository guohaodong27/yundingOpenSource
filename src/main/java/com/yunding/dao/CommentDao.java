package com.yunding.dao;

import com.yunding.dao.entities.Comment;

public interface CommentDao {
    int insert(Comment record);

    int insertSelective(Comment record);
}