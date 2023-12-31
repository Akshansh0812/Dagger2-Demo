package com.example.dagger2demo

class UserRegistrationService(
    private val userRepository: UserRepository,
    private val emailService: EmailService
) {
    fun registerUser(email:String, password:String){
        userRepository.saveUser(email, password)
        emailService.send(email, "no-reply@gmail.com", "User registered")
    }
}