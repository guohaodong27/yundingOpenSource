package com.yunding.dao;

import com.yunding.dao.entities.Article;
import com.yunding.dao.entities.ArticleExtend;

public interface ArticleDao {

    int deleteByPrimaryKey(String articleId);

    int insert(ArticleExtend record);

    int insertSelective(ArticleExtend record);

    ArticleExtend selectByPrimaryKey(String articleId);

    int updateByPrimaryKeySelective(ArticleExtend record);

    int updateByPrimaryKeyWithBLOBs(ArticleExtend record);

    int updateByPrimaryKey(Article record);
}