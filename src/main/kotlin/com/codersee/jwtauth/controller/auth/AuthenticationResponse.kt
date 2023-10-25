package com.codersee.jwtauth.controller.auth

data class AuthenticationResponse(
  val accessToken: String,
  val refreshToken: String,
)