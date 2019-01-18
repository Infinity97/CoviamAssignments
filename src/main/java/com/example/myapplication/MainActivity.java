package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("LifeCycle" , "MainActivity onCreate");

        Button myButton = findViewById(R.id.Mybutton);
        myButton.setOnClickListener(new View.OnClickListener(){

            // 
            @Override
             public void onClick(View v){

                Log.i("LifeCycle", "This is the new Button");

               Intent intent = new Intent(MainActivity.this , RecyclerViewActivity.class);

               //intent.putExtra("STRING_RESULT", "Ayush");
               //intent.putExtra("INT_RESULT", 1234)    ;
                setContentView(R.layout.activity_first);
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?client=firefox-b-ab&q=content+provider+in+android"));
                //startActivity(i);
                startActivity(intent);
            }
        });

        Button myButton1 = findViewById(R.id.myButton2);
        myButton1.setOnClickListener(new View.OnClickListener(){
        //
            @Override
             public void onClick(View v){
                Log.i("LifeCycle", "This is the new Button2");
                Intent intent = new Intent(MainActivity.this , SecondActivity.class);
                //setContentView(R.layout.activity_first);
                startActivity(intent);
            }
        });

        Button myButton3 = findViewById(R.id.myButton3);
        myButton.setOnClickListener(new View.OnClickListener(){

            //
            @Override
            public void onClick(View v){

                Log.i("LifeCycle", "This is the new Button");

                Intent intent = new Intent(MainActivity.this , RecyclerViewActivity.class);

                //intent.putExtra("STRING_RESULT", "Ayush");
                //intent.putExtra("INT_RESULT", 1234)    ;
                //setContentView(R.layout.);
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?client=firefox-b-ab&q=content+provider+in+android"));
                //startActivity(i);
                startActivity(intent);
            }
        });

















    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
         Log.i("LifeCycle" , "MainActivity onDestroy");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("LifeCycle" , "MainActivity onStart");

        SharedPreferences sharedPreferences = getSharedPreferences("Ayush", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("int_key", 0);
        editor.putString("string_key","Ayush");
        editor.commit();
        editor.apply();
        //String str = sharedPreferences.getString("1", null);
        //Log.i("LifeCycle", str);
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("LifeCycle" , "MainActivity onRestart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("LifeCycle" , "MainActivity onResume");
    }
    @Override
    protected void onPause(){

        super.onPause();
        Log.i("LifeCycle" , "MainActivity onPause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("LifeCycle" , "MainActivity onStop");
    }
}
