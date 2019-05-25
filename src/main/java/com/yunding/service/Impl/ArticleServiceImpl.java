package com.yunding.service.Impl;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.google.gson.Gson;
import com.yunding.dao.UserDao;
import com.yunding.tools.ArrayToString;
import com.yunding.tools.MyConst;
import com.yunding.dao.ArticleDao;
import com.yunding.dao.entities.ArticleExtend;
import com.yunding.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service("ArticleService")
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private final MyConst myConst = null;
    @Autowired
    private final ArticleDao articleDao = null;
    @Autowired
    private final UserDao userDao = null;
    @Autowired
    private final Gson gson = null;
    /**
     * 获取最近的10篇
     * @param page 页数
     * @return 文章的list集合
     */
    public List<ArticleExtend> listArticle(int page) {
        return articleDao.selectOrderByTime(page,myConst.getPageSize());
    }

    /**
     * 保存ArticleExtend对象到数据库
     * @param articleExtend ArticleExtend 对象,id必须为空
     * @return true保存成功 false 保存失败
     */
    public boolean saveArticle(ArticleExtend articleExtend) {
        //todo 事务处理

        articleDao.insert(articleExtend);
        return true;
    }

    /**
     * 通过主键删除文章
     *
     * @param primaryKey 文章的唯一标示(id)
     * @return 成功返回true 失败返回false
     */
    public boolean deleteArticle(String primaryKey) {
        articleDao.deleteByPrimaryKey(primaryKey);
        return true;
    }

    /**
     * 通过主键点赞文章
     *
     * @param primaryKey 文章的唯一标示(id)
     * @return 成功返回true 失败返回false
     */
    public boolean praise(String primaryKey) {
            return articleDao.updatePrimaryPraise(primaryKey);
    }

    /**
     * 通过主键转发文章
     *
     * @param primaryKey 文章的唯一标示(id)
     * @param userId     转发者的标示(id)
     * @return 成功返回true 失败返回false
     */
    public boolean forWard(String primaryKey, String userId) {
        return false;
    }

    /**
     * 通过主键评论文章
     *
     * @param primaryKey 文章的唯一标示(id)
     * @param userId     评论者的id
     * @return 成功返回true 失败返回false
     */
    public boolean comment(String primaryKey, String userId)
    {
        return false;
    }

    /**
     * 通过主键收藏文章
     * @param primaryKey 文章的唯一标示(id)
     * @param userId     收藏者的id
     * @return 成功返回true 失败返回false
     */
    public boolean favorite(String primaryKey, String userId) {
        String oldFavorite = userDao.selectByPrimaryKey(userId).getUserFavorite();
        List<String> list = ArrayToString.toList(oldFavorite);
        list.add(1,"sdfasf");

        return false;

    }
}
