package com.onaumenko.springboot.springboottest.service;

import com.onaumenko.springboot.springboottest.dao.ArticleRepository;
import com.onaumenko.springboot.springboottest.dao.UserRepository;
import com.onaumenko.springboot.springboottest.entity.Article;
import com.onaumenko.springboot.springboottest.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ArticleServiceImpl implements ArticleService{

    @Autowired
    private ArticleRepository articleRepository;
    private UserRepository userRepository;

    @Override
    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    @Override
    public void saveArticle(Article article) {
        userRepository.
        articleRepository.saveAndFlush(article);
    }

    @Override
    public Article getArticle(UUID id) {
        return articleRepository.getById(id);
    }

    @Override
    public void deleteArticle(UUID id) {
      articleRepository.deleteById(id);
    }
}
