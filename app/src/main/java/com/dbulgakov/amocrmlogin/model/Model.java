package com.dbulgakov.amocrmlogin.model;

import com.dbulgakov.amocrmlogin.model.DTO.Leads.LeadsResponse;
import com.dbulgakov.amocrmlogin.model.DTO.Login.LoginResponse;

import rx.Observable;

public interface Model {
    Observable<LoginResponse> performAuth(String userEmail, String password);
    Observable<LeadsResponse> getLeads(String userEmail, String userApiKey, String userDomain);
}
