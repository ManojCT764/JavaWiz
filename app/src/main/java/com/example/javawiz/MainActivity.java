package com.example.javawiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void enterquiz(View Q){
        Toast.makeText(this, "ALL THE BEST", Toast.LENGTH_SHORT).show();
        Intent quiz = new Intent(this, quiz.class);
        startActivity(quiz);
    }
}