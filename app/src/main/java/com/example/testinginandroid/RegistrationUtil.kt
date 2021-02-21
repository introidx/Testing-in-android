package com.example.testinginandroid

object RegistrationUtil {

    private val existingUsers = listOf("Prakash" , "Rohan")

    /**
     * The test cases will pass if..
     * ...username/password/confirmPassword is not empty
     * ...password is at least 2 digits
     * ...password matches the confirm Password
     * ...username is already taken
     */
    fun validRegistrationInput(
        userName : String,
        password : String,
        confirmPassword : String
    ) : Boolean {
        if (userName.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()){
            return false
        }
        if (userName in existingUsers){
            return false
        }
        if (password != confirmPassword){
            return false
        }
        if (password.count { it.isDigit() } < 2){
            return false
        }
        return true
    }
}