package com.example.health;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class IntroScreen extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_screen);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4= (Button)findViewById(R.id.button4) ;
        b5 = (Button)findViewById(R.id.button5);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMeetNewDoctor();
            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAllPrescriptions();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMedicines();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConsultations();
            }

        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAppointments();
            }
        });
    }
    public void openMeetNewDoctor(){
        Intent intent=new Intent(this,MeetNewDoctor.class);
        startActivity(intent);
    }
    public void openAllPrescriptions(){
        Intent intent=new Intent(this,AllPrescriptions.class);
        startActivity(intent);
    }
    public void openMedicines(){
        Intent intent=new Intent(this,Medicines.class);
                startActivity(intent);
    }
    public void openConsultations(){
        Intent intent=new Intent(this,Consultations.class);
        startActivity(intent);
    }
    public void openAppointments(){
        Intent intent=new Intent(this,Appointments.class);
        startActivity(intent);
    }
}
