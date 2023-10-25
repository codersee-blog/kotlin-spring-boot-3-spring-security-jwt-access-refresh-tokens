package com.codersee.jwtauth.controller.article

import com.codersee.jwtauth.model.Article
import com.codersee.jwtauth.service.ArticleService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/api/article")
class ArticleController(
  private val articleService: ArticleService
) {

  @GetMapping
  fun listAll(): List<ArticleResponse> =
    articleService.findAll()
      .map { it.toResponse() }

  private fun Article.toResponse(): ArticleResponse =
    ArticleResponse(
      id = this.id,
      title = this.title,
      content = this.content,
    )
}