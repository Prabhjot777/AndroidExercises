package com.prabhjot.exercise_41;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activity_c extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
    }
    public void BtnClicked(View view){

        EditText textValue = findViewById(R.id.textView3);

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("activity_text",textValue.getText().toString());
        startActivity(intent);
    }
}
