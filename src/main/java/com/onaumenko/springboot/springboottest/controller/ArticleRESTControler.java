package com.onaumenko.springboot.springboottest.controller;

import com.onaumenko.springboot.springboottest.entity.Article;
import com.onaumenko.springboot.springboottest.entity.User;
import com.onaumenko.springboot.springboottest.service.ArticleService;
import com.onaumenko.springboot.springboottest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ArticleRESTControler {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/articles")
    public List<Article> showAllArticles(){
        List<Article> allArticles = articleService.getAllArticles();
        return allArticles;
    }

    @PostMapping("/articles")
    public Article addNewArticle(@RequestBody Article article){
        articleService.saveArticle(article);
        return article;
    }
}
