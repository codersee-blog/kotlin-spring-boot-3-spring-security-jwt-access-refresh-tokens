package com.codersee.jwtauth.controller.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("jwt")
data class JwtProperties(
  val key: String,
  val accessTokenExpiration: Long,
  val refreshTokenExpiration: Long,
)
