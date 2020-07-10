package com.prabhjot.materiallight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText myfirstname = null;
    EditText mylasttname = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myfirstname = findViewById(R.id.main_firstNameedit);
        mylasttname = findViewById(R.id.main_lastNameedit);
    }

public void btncontinue(View theViewThatGotClicked){
        Intent intent=new Intent(this,OutputActivity.class);
        intent.putExtra("fname",myfirstname.getText().toString());
        intent.putExtra("lname",mylasttname.getText().toString());
        startActivity(intent);
}
public void btncancel(View theViewThatGotClicked){
    Toast.makeText(this, "you pressed cancel", Toast.LENGTH_SHORT).show();
}
}