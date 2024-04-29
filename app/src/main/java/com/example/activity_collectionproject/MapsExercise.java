package com.example.activity_collectionproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MapsExercise extends AppCompatActivity {

    ImageButton imgbtnSNino,imgbtnCOP,imgbtnFSP,imgbtnTOL,imgbtnKF;
    View screenView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_exercise);

        screenView = findViewById(R.id.MapsMenu);

        imgbtnSNino = (ImageButton) findViewById(R.id.imgbtnStoNino);
        imgbtnSNino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:10.2944040861158, 123.90211512522087"));
                startActivity(intent);
                screenView.setBackgroundResource(R.drawable.stonino_2);
            }
        });

        imgbtnCOP = (ImageButton) findViewById(R.id.imgbtnCebuOceanPark);
        imgbtnCOP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:10.281620997739713, 123.87854095697995"));
                startActivity(intent);
                screenView.setBackgroundResource(R.drawable.oceanpark_2);
            }
        });

        imgbtnFSP = (ImageButton) findViewById(R.id.imgbtnFortSanPedro);
        imgbtnFSP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:10.292689226000553, 123.90565745405655"));
                startActivity(intent);
                screenView.setBackgroundResource(R.drawable.fortspedro_2);
            }
        });

        imgbtnTOL = (ImageButton) findViewById(R.id.imgbtnTempleOfLeah);
        imgbtnTOL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:10.369094315855094, 123.87331656939914"));
                startActivity(intent);
                screenView.setBackgroundResource(R.drawable.templeofleah_2);
            }
        });

        imgbtnKF = (ImageButton) findViewById(R.id.imgbtnKawasanFalls);
        imgbtnKF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:9.803775566546053, 123.37432076754496"));
                startActivity(intent);
                screenView.setBackgroundResource(R.drawable.kawasanfalls2);
            }
        });
    };




}