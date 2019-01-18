package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.example.myapplication.retrofit2.Banners;
import com.example.myapplication.retrofit2.Response;

import java.util.ArrayList;
import java.util.List;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ThirdActivity extends AppCompatActivity {
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout_scroll);
        List imageUrlList;
        linearLayout = findViewById(R.id.linearLayout1);
        OkHttpClient client = new OkHttpClient.Builder().build();

        final Retrofit retrofit = new Retrofit.Builder().baseUrl("https://www.blibli.com/backend/mobile/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();

        IApiClass iApiClass = retrofit.create(IApiClass.class);
        iApiClass.getHomeResponse().enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                Log.i("LifeCycleRetrofitSucces", response.body().toString());



                Banners banners=response.body().getBanners();
                List<String>list=new ArrayList<String>();
                for(int i=0;i<response.body().getBanners().getCarouselBanners().size();i++) {
                    list.add(response.body().getBanners().getCarouselBanners().get(i).getImageUrl(i));
                }
                for(int i=0;i<response.body().getBanners().getTopBanners().size();i++) {
                    list.add(response.body().getBanners().getCarouselBanners().get(i).getImageUrl(i));
                }
                for(String s:list){
                    ImageView iv=new ImageView(ThirdActivity.this);
                    Glide.with(ThirdActivity.this)
                            .load(s)
                            .into(iv);
                    linearLayout.addView(iv);
                }
            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {
                Log.i("LifeCycleRetrofitSucces", t.toString());

            }
        });
        }
}
