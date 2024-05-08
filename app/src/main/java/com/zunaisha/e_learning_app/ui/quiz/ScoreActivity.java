package com.zunaisha.e_learning_app.ui.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;

import com.zunaisha.e_learning_app.R;

public class ScoreActivity extends AppCompatActivity {

    EditText scoreTxt,totalTxt;
    int score;
    int total;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        score = getIntent().getIntExtra( "score",0);
        total = getIntent().getIntExtra( "total",0);

        scoreTxt = findViewById(R.id.score);
        totalTxt =findViewById(R.id.total);

        scoreTxt.setText(String.valueOf(score));
        totalTxt.setText(String.valueOf(total));
    }
}