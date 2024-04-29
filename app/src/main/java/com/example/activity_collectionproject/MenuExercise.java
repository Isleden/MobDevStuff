package com.example.activity_collectionproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MenuExercise extends AppCompatActivity {
    Button btnChanger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_exercise);
        btnChanger = findViewById(R.id.btnTransformingButton);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_menu_exercise,menu);
        return true;
    }


    public boolean onOptionItemSelected(@NonNull MenuItem item)
    {
        if(item.getItemId() == R.id.mItemChange){
            Toast.makeText(this,"Edit Object Item is clicked", Toast.LENGTH_SHORT).show();

        }else if(item.getItemId() == R.id.mItemReset){
            Toast.makeText(this,"Reset Object Item is clicked",Toast.LENGTH_SHORT).show();
            btnChanger.setBackgroundColor(Color.GRAY);
            btnChanger.setText("");
            btnChanger.setClickable(true);
        }else if(item.getItemId() == R.id.mItemExit){
            finish();
        }


        if(item.getItemId() == R.id.btnColorChange){
            colorChange();
        }else if(item.getItemId() == R.id.btnSadRed){
            neutralRed();
        }else if(item.getItemId() == R.id.btnChangeClickable){
            changeClickable();
        }else if(item.getItemId() == R.id.btnChangeFace){
            changeFace();
        }else if(item.getItemId() == R.id.btnChangeTextColor){
            changeTextColor();
        }
        return true;
    }

    public void neutralRed() {
        btnChanger.setText(":|");
        btnChanger.setBackgroundColor(Color.BLACK);
    }

    public void changeClickable(){
        btnChanger.setClickable(false);

    }
    public void changeFace(){
        btnChanger.setText("*_*");
    }
    public void changeTextColor(){
        btnChanger.setTextColor(Color.RED);
    }

    public void colorChange(){
        btnChanger.setBackgroundColor(Color.BLUE);
    }
}