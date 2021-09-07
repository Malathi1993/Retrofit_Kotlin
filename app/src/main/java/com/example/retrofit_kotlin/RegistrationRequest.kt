package com.example.retrofit_kotlin

    data class RegistrationRequest(

        val iPAddress: String,
        val language: String,
        val deviceType: String,
        val latitude: String,
        val longitude: String,
        val deviceId: String,
        val name: String,
        val emailId: String,
        val deviceName: String,
        val deviceModel: String,
        val deviceMac: String,
        val appVersion: String,
        val customerType: String,
        val pushNotificationToken: String
    )
