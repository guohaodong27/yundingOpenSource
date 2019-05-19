package com.yunding.dao.entities;

import java.io.Serializable;

/**
 * article
 * @author guohaodong
 */
public class Article implements Serializable {
    private String articleId;

    private String articleTime;

    private String articleType;

    private Integer articlePraiseNum;

    private Integer articleCommentNum;

    private Integer articleForwardNum;

    private String articleTitle;

    private String userId;

    private String userName;

    private static final long serialVersionUID = 1L;

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getArticleTime() {
        return articleTime;
    }

    public void setArticleTime(String articleTime) {
        this.articleTime = articleTime;
    }

    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String articleType) {
        this.articleType = articleType;
    }

    public Integer getArticlePraiseNum() {
        return articlePraiseNum;
    }

    public void setArticlePraiseNum(Integer articlePraiseNum) {
        this.articlePraiseNum = articlePraiseNum;
    }

    public Integer getArticleCommentNum() {
        return articleCommentNum;
    }

    public void setArticleCommentNum(Integer articleCommentNum) {
        this.articleCommentNum = articleCommentNum;
    }

    public Integer getArticleForwardNum() {
        return articleForwardNum;
    }

    public void setArticleForwardNum(Integer articleForwardNum) {
        this.articleForwardNum = articleForwardNum;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}