package com.example.javawiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class quiz extends AppCompatActivity {

    public String []questions  = {"Java is a programming language", "Java is an object-oriented programming language", "Java applications can only run on Windows computers",
            "In Java, the main method is the entry point of a program", "Java is a case-sensitive language",
             "Java supports multiple inheritance"};

    private Boolean []answer = {true, true, false, true, false, false};

    private int score=0;

    Button yes;
    Button no;
    TextView question;

    private int index=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        yes= findViewById(R.id.yes);
        no= findViewById(R.id.no);
        question = findViewById(R.id.question);
        question.setText(questions[index]);
        //code for yes button
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index <= questions.length-1){
                   //if answer is correct
                   if(answer[index]== true){
                       score++;
                   }
                   index++;
                   if(index <=questions.length-1){
                       question.setText(questions[index]);
                   }
                   else{
                       Toast.makeText(quiz.this, "Your score is : "+ score, Toast.LENGTH_SHORT).show();
                   }
                }
                else{
                    Toast.makeText(quiz.this, "Please RESTART the app to play again", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //code for no button
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index <= questions.length-1){
                    //if answer is correct
                    if(answer[index] == false){
                        score++;
                    }
                    index++;
                    if(index <=questions.length-1){
                        question.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(quiz.this, "Your score is : "+ score, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(quiz.this, "Please RESTART the app to play again", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }

}