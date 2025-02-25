package com.example.professional.data.repository

import com.example.professional.data.model.User
import com.example.professional.data.remote.ApiService

interface UserRepository {
    suspend fun getUser(id : Int) : User
    suspend fun saveUser(user : User)
}

class UserRepositoryImpl(private val user: User, private val apiService: ApiService) : UserRepository {
    override suspend fun getUser(id: Int): User {
       return  User(1, "bob", "bob@gmail.com", "efwfefefwwefefwweefwfw")
    }
    override suspend fun saveUser(user: User) {

    }
}