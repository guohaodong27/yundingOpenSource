package com.yunding.service.Impl;

import com.yunding.dao.ArticleDao;
import com.yunding.dao.entities.ArticleExtend;
import com.yunding.service.ArticleService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

@Service("ArticleService")
public class ArticleServiceImpl implements ArticleService {
    private final SqlSessionTemplate sqlSessionTemplate;

    public ArticleServiceImpl(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public void listArticle() {
        ArticleDao articleDao = sqlSessionTemplate.getMapper(ArticleDao.class);
        ArticleExtend articleExtend = articleDao.selectByPrimaryKey("1");
    }
}
