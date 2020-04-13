package com.loginkt.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Users {
    @SerializedName("email")
    @Expose
    var email: String? = null

}