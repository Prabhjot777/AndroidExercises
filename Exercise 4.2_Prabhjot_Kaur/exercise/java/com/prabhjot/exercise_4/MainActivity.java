package com.prabhjot.exercise_4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etColor;
    private Button btnChange;
    Context ctx = this;
    String[] color = {"Red","Green","Cyan","Blue"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etColor = findViewById(R.id.et_Color);
        btnChange = findViewById(R.id.btn_Change);

        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder builderColor= new AlertDialog.Builder(ctx);
                builderColor.setTitle("Select a color");
                builderColor.setSingleChoiceItems(color, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which){
                            case 0:
                                etColor.setText("Red");
                                etColor.setTextColor(Color.RED);
                                break;
                            case 1:
                                etColor.setText("Green");
                                etColor.setTextColor(Color.GREEN);
                                break;
                            case 2:
                                etColor.setText("Cyan");
                                etColor.setTextColor(Color.CYAN);
                                break;
                            case 3:
                                etColor.setText("Blue");
                                etColor.setTextColor(Color.BLUE);
                                break;
                        }
                        Toast.makeText(ctx, color[which], Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                });
                AlertDialog dialogColor= builderColor.create();
                dialogColor.show();
            }
        });
    }
}
