package com.example.dagger2demo

import android.util.Log
import com.example.dagger2demo.Constants.Companion.TAG

class UserRepository {
    fun saveUser(email:String, password:String){
        Log.d(TAG, "User Saved in DB")
    }
}