package com.example.activity_collectionproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonExercise extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_exercise);

        btn1 = (Button) findViewById(R.id.btnActivity1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ButtonExercise.this, Activity1.class);
                startActivity(intent1);
            }
        });

        btn2 = (Button) findViewById(R.id.btnActivity2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ButtonExercise.this, "Error Message!", Toast.LENGTH_SHORT).show();
            }
        });

        btn3 = (Button) findViewById(R.id.btnActivity3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn3.setAlpha(0);
            }
        });
    }
}