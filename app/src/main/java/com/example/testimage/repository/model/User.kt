package com.example.testimage.repository.model

data class UserInfo(
    val user: User
)

data class User(
    val first_name: String,
    val second_name: String,
    val photo: String,
    val education: String,
    val company: List<Company>,
)

data class Company(
    val name: String,
    val position: String
)