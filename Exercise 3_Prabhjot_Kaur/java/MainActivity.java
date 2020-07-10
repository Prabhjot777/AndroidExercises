package com.prabhjot.exercise3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ActionMenuItemView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    String[] Names = {"Sidhu","Ammy","Tarsem","Diljit"};
    int[] Images = {R.drawable.first,R.drawable.second,R.drawable.third,R.drawable.fourth};
    String[] Real={"Shubhdeep Singh Sidhu","Amanider Singh Virk","Tarsem Singh Jassar","Diljit singh Dosanjh"};
    String[] Age={"Age-23 years","Age-25 years","Age-28 years","Age-32 years"};
    String[] Job = {"singer","actor","lyrical","judge"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridview);

        CustomAdapter customAdapter = new CustomAdapter();
        gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),GriditemActivity.class);
                intent.putExtra("name",Names[position]);
                intent.putExtra("image",Images[position]);
                intent.putExtra("real",Real[position]);
                intent.putExtra("age",Age[position]);
                intent.putExtra("job",Job[position]);
                startActivity(intent);
            }
        });
    }
    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return Images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.row_data, null);
            TextView name = view1.findViewById(R.id.singer);
            ImageView image = view1.findViewById(R.id.images);

            name.setText(Names[i]);
            image.setImageResource(Images[i]);
            return view1;

        }
    }
}