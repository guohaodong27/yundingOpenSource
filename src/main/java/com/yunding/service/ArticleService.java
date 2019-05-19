package com.yunding.service;

import com.yunding.dao.entities.ArticleExtend;

import java.util.List;

public interface ArticleService {
    /**
     * 获取最近的10篇
     * @param page 页数
     * @return 文章的list集合
     */
    List<ArticleExtend> listArticle(int page);

    /**
     * 保存ArticleExtend对象到数据库
     * @param articleExtend ArticleExtend 对象,id必须为空
     * @return true保存成功 false 保存失败
     */
    boolean saveArticle(ArticleExtend articleExtend);

    /**
     * 通过主键删除文章
     * @param primaryKey 文章的唯一标示(id)
     * @return 成功返回true 失败返回false
     */
    boolean deleteArticle(String primaryKey);

    /**
     * 通过主键点赞文章
     *  @param primaryKey 文章的唯一标示(id)
     *  @return 成功返回true 失败返回false
     */
    boolean praise(String primaryKey);

    /**
     * 通过主键转发文章
     * @param primaryKey 文章的唯一标示(id)
     * @param userId 转发者的标示(id)
     * @return 成功返回true 失败返回false
     */
    boolean forWard(String primaryKey,String userId);

    /**
     * 通过主键评论文章
     * @param primaryKey 文章的唯一标示(id)
     * @param userId 评论者的id
     * @return 成功返回true 失败返回false
     */
    boolean comment(String primaryKey,String userId);

    /**
     * 通过主键收藏文章
     * @param primaryKey 文章的唯一标示(id)
     * @param userId 收藏者的id
     * @return 成功返回true 失败返回false
     */
    boolean favorite(String primaryKey,String userId);


}

