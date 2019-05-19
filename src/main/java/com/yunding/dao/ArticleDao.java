package com.yunding.dao;

import com.yunding.dao.entities.Article;
import com.yunding.dao.entities.ArticleExtend;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Bean;

import java.util.List;
public interface ArticleDao {

    int deleteByPrimaryKey(String articleId);

    /**
     * 插入文章
     * @param record ArticleExtend 对象
     * @return
     */
    int insert(ArticleExtend record);

    int insertSelective(ArticleExtend record);

    /**
     * 通过主键查询
     * @param articleId 文章的唯一标示符
     * @return 单个ArticleExtend对象
     */
    ArticleExtend selectByPrimaryKey(String articleId);

    /**
     * 通过时间排序(获取最新数据),分页
     * @param page 页数
     * @param pageSize 分页大小
     * @return ArticleExtend 对象的集合list
     */
    List<ArticleExtend> selectOrderByTime(@Param("page") int page, @Param("pageSize") int pageSize);

    /**
     * 更新文章
     * @param record 更新的文章对象
     * @return
     */
    int updateByPrimaryKeySelective(ArticleExtend record);

    int updateByPrimaryKeyWithBLOBs(ArticleExtend record);

    int updateByPrimaryKey(Article record);
}