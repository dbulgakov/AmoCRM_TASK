package com.dbulgakov.amocrmlogin.model.DTO.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginResponse {

    @SerializedName("response")
    @Expose
    private LoginResponseInfo loginResponseInfo;

    public LoginResponseInfo getLoginResponseInfo() {
        return loginResponseInfo;
    }
}
