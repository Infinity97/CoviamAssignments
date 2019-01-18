package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout_test);

        EditText t1 = findViewById(R.id.textFirstName);
        EditText t2 = findViewById(R.id.textLastName);
        EditText t3 = findViewById(R.id.textDOB);
        EditText t4 = findViewById(R.id.textJoiningDate);

        t1.setText("Ayush");
        t2.setText("Surana");
        t3.setText("06/11/1997");
        t4.setText("05/12/2018");

        String toastContent = t1.getText() + " " + t1.getText() + t2.getText() +  " " + t3.getText() + " " + t4.getText();
        Toast.makeText(FirstActivity.this, toastContent, Toast.LENGTH_LONG).show();
        Toast.makeText(this, String.valueOf(getIntent().getIntExtra("INT_EXTRA",0)), Toast.LENGTH_LONG).show();
        Toast.makeText(this, getIntent().getStringExtra("STRRING_RESULT"), Toast.LENGTH_LONG).show();



    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LifeCycle" , "FirstActivity onDestroy");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("LifeCycle" , "FirstActivity onStart");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("LifeCycle" , "FirstActivity onRestart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("LifeCycle" , "FirstActivity onResume");
    }
    @Override
    protected void onPause(){

        super.onPause();
        Log.i("LifeCycle" , "FirstActivity onPause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("LifeCycle" , "FirstActivity onStop");
    }
}
