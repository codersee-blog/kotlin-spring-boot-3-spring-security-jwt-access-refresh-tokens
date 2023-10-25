package com.codersee.jwtauth.service

import com.codersee.jwtauth.model.Article
import com.codersee.jwtauth.repository.ArticleRepository
import org.springframework.stereotype.Service

@Service
class ArticleService(
  private val articleRepository: ArticleRepository
) {

  fun findAll(): List<Article> =
    articleRepository.findAll()
}
