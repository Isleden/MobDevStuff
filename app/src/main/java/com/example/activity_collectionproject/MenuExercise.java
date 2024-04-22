package com.example.activity_collectionproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MenuExercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_exercise);

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
        if(item.getItemId() == R.id.mItemChange)
        {
            Toast.makeText(this,"Edit Object Item is clicked", Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId() == R.id.mItemReset)
        {
            Toast.makeText(this,"Reset Object Item is clicked", Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId() == R.id.mItemExit)
        {
            finish();
        }
        return true;
    }
}