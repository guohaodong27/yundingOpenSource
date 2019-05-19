package com.yunding.controller;

import com.google.gson.Gson;
import com.yunding.dao.entities.ArticleExtend;
import com.yunding.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("article")
public class ArticleController {

    @Autowired
    Gson gson;
    @Autowired
    ArticleService articleService;

    @RequestMapping("save")
    public boolean save(@RequestBody String json) {
        ArticleExtend articleExtend = gson.fromJson(json,com.yunding.dao.entities.ArticleExtend.class);
        return articleService.saveArticle(articleExtend);
    }

    @PostMapping("praise")
    public boolean praise(@RequestBody String json){
        ArticleExtend articleExtend = gson.fromJson(json,com.yunding.dao.entities.ArticleExtend.class);
        return articleService.praise(articleExtend.getArticleId());
    }
}
