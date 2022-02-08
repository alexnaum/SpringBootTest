package com.onaumenko.springboot.springboottest.service;

import com.onaumenko.springboot.springboottest.entity.Article;
import com.onaumenko.springboot.springboottest.entity.User;
import java.util.List;
import java.util.UUID;

public interface ArticleService {

    public List<Article> getAllArticles();

    public void saveArticle(Article article);

    public Article getArticle(UUID id);

    public void deleteArticle(UUID id);
}
