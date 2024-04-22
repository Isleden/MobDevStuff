package com.example.activity_collectionproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class PassingIntentsExercise extends AppCompatActivity {
    EditText etxtFname,etxtLname,editTextDate,etxtPhoneNumber,etxtEmailAdd,etxtCourse,etxtYearLevel,etxtCurrSchool,etxtHighSchool,etxtGradeSchool;
    RadioButton radMale,radFemale,radOthers;

    Button btnClear, btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise);

        etxtFname = findViewById(R.id.etxtFName);
        etxtLname = findViewById(R.id.etLName);
        editTextDate = findViewById(R.id.etxtBdate);
        etxtPhoneNumber = findViewById(R.id.etxtPhoneNumber);
        etxtEmailAdd = findViewById(R.id.etxtEmailAdd);
        etxtCourse = findViewById(R.id.etxtCourse);
        etxtYearLevel = findViewById(R.id.etxtYearLevel);
        etxtCurrSchool = findViewById(R.id.etxtCurrSchool);
        etxtHighSchool = findViewById(R.id.etxtHighSchool);
        etxtGradeSchool = findViewById(R.id.etxtGradeSchool);

        radMale = findViewById(R.id.radMale);
        radFemale = findViewById(R.id.radFemale);
        radOthers = findViewById(R.id.radOthers);

        btnClear = findViewById(R.id.btnClear);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String fName = etxtFname.getText().toString();
                String lName = etxtLname.getText().toString();
                String Bdate = editTextDate.getText().toString();
                String PhoneNumber = etxtPhoneNumber.getText().toString();
                String EmailAddress = etxtEmailAdd.getText().toString();
                String Course = etxtCourse.getText().toString();
                String YearLevel = etxtYearLevel.getText().toString();
                String CurrentSchool = etxtCurrSchool.getText().toString();
                String HighSchool = etxtHighSchool.getText().toString();
                String GradeSchool = etxtGradeSchool.getText().toString();

                String gender;
                if(radMale.isChecked())
                {
                    gender = "Male";
                }
                else if(radFemale.isChecked())
                {
                    gender = "Female";
                }
                else if(radOthers.isChecked())
                {
                    gender = "Others";
                }
                else
                {
                    gender = "Unknown";
                }

                Intent intent = new Intent(PassingIntentsExercise.this, PassingIntentsExercise2.class);
                intent.putExtra("fname_key",fName);
                intent.putExtra("Lname_key",lName);
                intent.putExtra("Bdate_key",Bdate);
                intent.putExtra("PhoneNumber_key",PhoneNumber);
                intent.putExtra("EmailAddress_key",EmailAddress);
                intent.putExtra("Course_key",Course);
                intent.putExtra("YearLevel_key",YearLevel);
                intent.putExtra("CurrentSchool_key",CurrentSchool);
                intent.putExtra("HighSchool_key",HighSchool);
                intent.putExtra("GradeSchool_key",GradeSchool);
                intent.putExtra("Gender_key",gender);

                startActivity(intent);
            }
        });
        btnClear = (Button) findViewById(R.id.btnClear);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(PassingIntentsExercise.this,PassingIntentsExercise.class);
                startActivity(intent1);
            }
        });
    }



}