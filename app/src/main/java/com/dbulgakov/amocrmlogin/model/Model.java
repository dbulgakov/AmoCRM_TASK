package com.dbulgakov.amocrmlogin.model;

import com.dbulgakov.amocrmlogin.model.DTO.response.LoginResponse;

import java.util.List;

import rx.Observable;

public interface Model {
    Observable<LoginResponse> performAuth(String username, String password);
}