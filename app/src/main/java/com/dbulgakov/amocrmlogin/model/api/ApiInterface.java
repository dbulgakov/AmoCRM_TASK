package com.dbulgakov.amocrmlogin.model.api;
import com.dbulgakov.amocrmlogin.model.DTO.Leads.LeadsResponse;
import com.dbulgakov.amocrmlogin.model.DTO.Login.LoginResponse;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;
import rx.Observable;

public interface ApiInterface {
    @FormUrlEncoded
    @POST("account/api_auth.php")
    Observable<LoginResponse> authUser(@Field("USER_LOGIN") String email, @Field("USER_PASSWORD") String password, @Query("type") String answerType);

    @GET
    Observable<LeadsResponse> getLeads(@Url String url);
}
