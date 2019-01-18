package com.example.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import adapter.RvAdapter;

public class RecyclerViewActivity extends AppCompatActivity {
    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

//        ImageView iv=findViewById(R.id.adBanner);
//        Glide.with(RecyclerViewActivity.this)
//                .load(imgUrl)
//                .into(iv);
        //linearLayout.addView(iv);

        ArrayList<String> dataList = new ArrayList();
        for (int i =0;i<15; i++){
            dataList.add(String.valueOf(i));
        }

        RecyclerView recyclerView = findViewById(R.id.rv1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RvAdapter rvAdapter = new RvAdapter(dataList);
        recyclerView.setAdapter(rvAdapter);

    }
}
