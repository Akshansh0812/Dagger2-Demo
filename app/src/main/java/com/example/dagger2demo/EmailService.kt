package com.example.dagger2demo

import android.util.Log
import com.example.dagger2demo.Constants.Companion.TAG

class EmailService {

    fun send(to:String, from:String, body: String?){
        Log.d(TAG, "Email Sent")
    }
}