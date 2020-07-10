package com.prabhjot.p82mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn1(View theButtonThatGotClicked){
        Intent intent=new Intent(this,ScrollLayoutActivity.class);
        startActivity(intent);
    }
    public void btn2(View theButtonThatGotClicked){
        Intent intent=new Intent(this,ImageActivity.class);
        startActivity(intent);
    }
}
