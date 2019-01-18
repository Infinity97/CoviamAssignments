package com.example.myapplication;

import com.example.myapplication.retrofit2.Response;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IApiClass {

    @GET("home.json")
    public Call<Response> getHomeResponse();

//    @GET("config.json")
//    public Call<Object> getConfigResponse();
}

