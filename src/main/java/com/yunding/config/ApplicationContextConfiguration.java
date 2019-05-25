package com.yunding.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yunding.dao.ArticleDao;
import com.yunding.dao.UserDao;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class ApplicationContextConfiguration {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    /**
     * 文章数据操作接口
     * @return
     */
    @Bean
    public ArticleDao articleDao(){
        return sqlSessionTemplate.getMapper(ArticleDao.class);
    }

    /**
     * 用户数据接口
     */
    @Bean
    public UserDao userDao(){
        return sqlSessionTemplate.getMapper(UserDao.class);
    }

    /**
     * Gson工具
     */
    @Bean
    public Gson gson(){
        GsonBuilder gsonBuilder = new GsonBuilder();
        return gsonBuilder.serializeNulls().create();
    }
}
