package com.prabhjot.materiallight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OutputActivity extends AppCompatActivity {
    TextView output1;
    String f_name;
    TextView output2;
    String l_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);
        output1=findViewById(R.id.output_text);
        f_name=getIntent().getExtras().getString("fname");
        output1.setText(f_name);

        output2=findViewById(R.id.output_text2);
        l_name=getIntent().getExtras().getString("lname");
        output2.setText(l_name);
    }
}
