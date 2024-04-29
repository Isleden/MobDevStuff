package com.example.activity_collectionproject;

import static com.example.activity_collectionproject.R.id.btnLayoutExercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;

    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btnLayoutExercise);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent intent1 = new Intent(MainActivity.this, LayoutExercise.class);
                 startActivity(intent1);
            }
        });

        btn2 = (Button) findViewById(R.id.btnInstagramActivity);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, InstagramActivity.class);
                startActivity(intent2);
            }
        });

        btn3 = (Button) findViewById(R.id.btnButtonExercise);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this, ButtonExercise.class);
                startActivity(intent3);
            }
        });

        btn4 = (Button) findViewById(R.id.btnCalculator);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(MainActivity.this, Calculator.class);
                startActivity(intent4);
            }
        });

        btn5 = (Button) findViewById(R.id.btnPassingIn);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(MainActivity.this, PassingIntentsExercise.class);
                startActivity(intent5);
            }
        });

        btn6 = (Button) findViewById(R.id.btnMenus);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(MainActivity.this, MenuExercise.class);
                startActivity(intent6);
            }
        });

        btn7 = (Button) findViewById(R.id.btnOpenMaps);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(MainActivity.this, MapsExercise.class);
                startActivity(intent7);
            }
        });
    }
}