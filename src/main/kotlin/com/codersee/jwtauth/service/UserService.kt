package com.codersee.jwtauth.service

import com.codersee.jwtauth.model.User
import com.codersee.jwtauth.repository.UserRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService(
  private val userRepository: UserRepository
) {

  fun createUser(user: User): User? {
    val found = userRepository.findByEmail(user.email)

    return if (found == null) {
      userRepository.save(user)
      user
    } else null
  }

  fun findByUUID(uuid: UUID): User? =
    userRepository.findByUUID(uuid)

  fun findAll(): List<User> =
    userRepository.findAll()
      .toList()

  fun deleteByUUID(uuid: UUID): Boolean =
    userRepository.deleteByUUID(uuid)
}
