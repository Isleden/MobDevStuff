package com.example.activity_collectionproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.time.Year;

public class PassingIntentsExercise2 extends AppCompatActivity {
    TextView tFname,tLname,tBDate,tPhoneNumber,tEmailAdd,tCourse,tYearLevel,tCurrSchool,tHighSchool,tGradeSchool,tGender;
    Button btnReturn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise2);

        tFname = findViewById(R.id.txtShowFname);
        tLname = findViewById(R.id.txtShowLname);
        tBDate = findViewById(R.id.txtShowBdate);
        tPhoneNumber = findViewById(R.id.txtShowPhoneNumber);
        tEmailAdd = findViewById(R.id.txtShowEmail);
        tCourse = findViewById(R.id.txtShowCourse);
        tYearLevel = findViewById(R.id.txtShowYearLevel);
        tCurrSchool = findViewById(R.id.txtShowCurrSchool);
        tHighSchool = findViewById(R.id.txtShowHighSchool);
        tGradeSchool = findViewById(R.id.txtShowGradeSchool);
        tGender = findViewById(R.id.txtShowGender);
        Intent intent = getIntent();

        String fName = intent.getStringExtra("fname_key");
        String lName = intent.getStringExtra("Lname_key");
        String Bdate = intent.getStringExtra("Bdate_key");
        String Pnumber = intent.getStringExtra("PhoneNumber_key");
        String Email = intent.getStringExtra("EmailAddress_key");
        String Course = intent.getStringExtra("Course_key");
        String YearLevel = intent.getStringExtra("YearLevel_key");
        String CurrSchool = intent.getStringExtra("CurrentSchool_key");
        String HighSchool = intent.getStringExtra("HighSchool_key");
        String GradeSchool = intent.getStringExtra("GradeSchool_key");
        String Gender = intent.getStringExtra("Gender_key");

        tFname.setText(fName);
        tLname.setText(lName);
        tBDate.setText(Bdate);
        tPhoneNumber.setText(Pnumber);
        tEmailAdd.setText(Email);
        tCourse.setText(Course);
        tYearLevel.setText(YearLevel);
        tCurrSchool.setText(CurrSchool);
        tHighSchool.setText(HighSchool);
        tGradeSchool.setText(GradeSchool);
        tGender.setText(Gender);

        btnReturn = (Button) findViewById(R.id.btnReturnHome);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(PassingIntentsExercise2.this, MainActivity.class);
                startActivity(intent5);
            }
        });
    }
}