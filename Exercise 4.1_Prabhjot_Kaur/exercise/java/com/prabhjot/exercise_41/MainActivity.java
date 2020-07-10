package com.prabhjot.exercise_41;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onResume() {
        super.onResume();

        TextView textView = findViewById(R.id.nextTextValue);

        Intent intent = getIntent();
        String editTextValue = intent.getStringExtra("activity_text");
        textView.setText(editTextValue);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.action_bar, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        switch (item.getItemId())
        {
            case R.id.actionBarItem1:
                startActivity(new Intent(this, Activity_a.class));
                break;
            case R.id.actionBarItem2:
                //Toast.makeText(this, "Activity B", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, Activity_b.class));
                break;
            case R.id.actionBarItem3:
                startActivity(new Intent(this, Activity_c.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}


