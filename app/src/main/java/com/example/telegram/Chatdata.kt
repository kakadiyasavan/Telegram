package com.example.telegram

import android.provider.ContactsContract.Profile

class Chatdata {

    var profile = 0
    lateinit var name:String
    lateinit var msg:String
    lateinit var time:String

    constructor(profile: Int,name:String,msg:String,time:String){
        this.profile = profile
        this.name = name
        this.msg = msg
        this.time = time
    }
}