package com.codersee.jwtauth.controller.user

import java.util.*

data class UserResponse(
  val uuid: UUID,
  val email: String,
)