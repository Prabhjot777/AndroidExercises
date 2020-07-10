package com.prabhjot.exercise3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class GriditemActivity extends AppCompatActivity {
    TextView name;
    ImageView image;
    TextView real;
    TextView age;
    TextView job;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_griditem);
        name=findViewById(R.id.griddata);
        image=findViewById(R.id.imageView);
        real=findViewById(R.id.realname);
        age=findViewById(R.id.realage);
        job=findViewById(R.id.realjob);


        Intent intent=getIntent();
        String receivedName =  intent.getStringExtra("name");
        int receivedImage = intent.getIntExtra("image",0);
        String receivedReal =  intent.getStringExtra("real");
        String receivedAge =  intent.getStringExtra("age");
        String receivedJob =  intent.getStringExtra("job");



        name.setText(intent.getStringExtra("name"));
        image.setImageResource(intent.getIntExtra("image",-1));
        real.setText(intent.getStringExtra("real"));
        age.setText(intent.getStringExtra("age"));
        job.setText(intent.getStringExtra("job"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
