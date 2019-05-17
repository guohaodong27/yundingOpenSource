package com.yunding.dao.entities;

import java.io.Serializable;

/**
 * article
 * @author 
 */
public class ArticleExtend extends Article implements Serializable {
    private String articleContent;

    private String articleTags;

    private static final long serialVersionUID = 1L;

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public String getArticleTags() {
        return articleTags;
    }

    public void setArticleTags(String articleTags) {
        this.articleTags = articleTags;
    }
}