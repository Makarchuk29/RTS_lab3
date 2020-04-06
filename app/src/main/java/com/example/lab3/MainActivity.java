package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openLab1(View view) {
        Intent intent = new Intent(this, Lab3_1.class);
        startActivity(intent);
    }

    public void openLab2(View view) {
        Intent intent = new Intent(this, Lab3_2.class);
        startActivity(intent);
    }

    public void openLab3(View view) {
        Intent intent = new Intent(this, Lab3_3.class);
        startActivity(intent);
    }
}
