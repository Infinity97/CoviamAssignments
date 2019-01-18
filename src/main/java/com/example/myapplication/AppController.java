package com.example.myapplication;

import android.app.Application;
import android.os.Bundle;

import java.util.List;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AppController extends Application {

    public static Retrofit retrofit = null;

    @Override
    public void onCreate() {
        super.onCreate();

        if (null == retrofit) {
            OkHttpClient client = new OkHttpClient.Builder().build();

            final Retrofit retrofit = new Retrofit.Builder().baseUrl("https://www.blibli.com/backend/mobile/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build();
        }
    }

}