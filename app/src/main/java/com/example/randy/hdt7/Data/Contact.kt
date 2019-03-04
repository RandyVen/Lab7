package com.example.randy.hdt7.Data

import androidx.lifecycle.LiveData
import androidx.room.PrimaryKey

class Contact (
    var name:String,
    var phoneNumber: String,
    var eMail:String,
    var priority: Int
    )
