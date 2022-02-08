package com.onaumenko.springboot.springboottest.dao;

import com.onaumenko.springboot.springboottest.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ArticleRepository extends JpaRepository<Article, UUID> {
}
