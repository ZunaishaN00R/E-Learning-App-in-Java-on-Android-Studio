package com.zunaisha.e_learning_app.ui.quiz;

import static android.app.ProgressDialog.show;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.zunaisha.e_learning_app.R;

import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.ArrayList;
import java.util.List;

public class StartQuiz extends AppCompatActivity {
    private TextView questionTxt,indicator;
    private LinearLayout container;
    private Button nextBtn,shareBtn;
    private int score = 0;
    private int position = 0;
    private int count = 0;
    DatabaseReference reference;
    private List<QuestionData> list;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_quiz);

        questionTxt =findViewById(R.id.question);
        indicator =findViewById(R.id.indicator);
        container =findViewById(R.id.linearLayout);
        nextBtn =findViewById(R.id.next_btn);
        shareBtn=findViewById(R.id.share_btn);

        list =  new ArrayList<>();
        reference = FirebaseDatabase.getInstance().getReference();
        reference.child("Questions").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for(DataSnapshot snapshot:dataSnapshot.getChildren()){
                    String question = snapshot.child("question").getValue().toString();
                    String option1 = snapshot.child("option1").getValue().toString();
                    String option2 = snapshot.child("option2").getValue().toString();
                    String option3 = snapshot.child("option3").getValue().toString();
                    String option4 = snapshot.child("option4").getValue().toString();
                    String correctAns = snapshot.child("answer").getValue().toString();

                    list.add(new QuestionData(option1,option2,option3,option4,question,correctAns));
                }
                if(list.size()>0){
                    loadQuestion(questionTxt,0,list.get(position).getQuestion());

                    for (int i = 0; i<4; i++){
                        container.getChildAt(i).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                checkAnswer((Button)view);
                            }
                        });
                    }

                    nextBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            nextBtn.setEnabled(false);
                            nextBtn.setAlpha(0.7f);
                            enabled(true);
                            position++;

                            if (position == list.size()) {
                                Intent intent = new Intent(StartQuiz.this, ScoreActivity.class);
                                intent.putExtra("score", score);
                                intent.putExtra("total", list.size());
                                startActivity(intent);
                                finish();
                                return;
                            }
                            count = 0;
                            loadQuestion(questionTxt, 0, list.get(position).getQuestion());
                        }
                    });
                    shareBtn.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View view){
                            String body = "*"+list.get(position).getQuestion()+"*\n"+
                                    "(a)"+list.get(position).getOption1()+"*\n"+
                                    "(b)"+list.get(position).getOption2()+"*\n"+
                                    "(c)"+list.get(position).getOption3()+"*\n"+
                                    "(d)"+list.get(position).getOption4();
                            Intent intent = new Intent(Intent.ACTION_SEND);
                            intent.setType("Text/Plain");
                            intent.putExtra(Intent.EXTRA_SUBJECT,"Learning App");
                            intent.putExtra(Intent.EXTRA_TEXT,body);
                            startActivity(Intent.createChooser(intent,"Share via"));
                        }
                    });
                }else{
                    Toast.makeText(StartQuiz.this, "No DataFound", Toast.LENGTH_SHORT).show();
                }
            }


            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(StartQuiz.this, databaseError.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void checkAnswer(Button selectedOption) {
        enabled(false);
        nextBtn.setEnabled(true);
        nextBtn.setAlpha(1);
        if (selectedOption.getText().toString().equals(list.get(position).getAnswer())) {
            selectedOption.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#4caf50")));
            Toast.makeText(StartQuiz.this, "Correct Answer!", Toast.LENGTH_SHORT).show();
            score++; // Increase score if the answer is correct
        } else {
            selectedOption.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#ff0000")));
            Button correctOption = container.findViewWithTag(list.get(position).getAnswer());
            correctOption.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#4caf50")));
            Toast.makeText(StartQuiz.this, "Incorrect Answer!", Toast.LENGTH_SHORT).show();
        }
    }
    private void enabled(Boolean enable){
        for(int i=0; i<4; i++){
            container.getChildAt(i).setEnabled(enable);
            if(enable){
                container.getChildAt(i).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#989898")));
            }
        }
    }

    private void loadQuestion(final View view, final int value,final String data){
        for (int i=0; i<4; i++){
            container.getChildAt(i).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#989898")));
        }
        view.animate().alpha(value).scaleX(value).scaleY(value).setDuration(500)
                .setStartDelay(100).setInterpolator(new DecelerateInterpolator())
                .setListener((new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animator) {
                        if(value==0 && count<4){
                            String option = "";
                            if(count == 0)
                                option = list.get(position).getOption1();
                            else if (count==1)
                                option = list.get(position).getOption2();
                            else if (count==2)
                                option = list.get(position).getOption3();
                            else if (count==3)
                                option = list.get(position).getOption4();

                            loadQuestion(container.getChildAt(count),0,option);
                            count++;
                        }
                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        if (value == 0) {
                            try {
                                ((TextView) view).setText(data);
                                indicator.setText(position + "/" + list.size());
                            } catch (ClassCastException e) {
                                ((Button) view).setText(data);
                            }
                            view.setTag(data);
                            loadQuestion(view, 1, data);
                        }
                    }

                    @Override
                    public void onAnimationCancel(Animator animator) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animator) {

                    }
                }));

    }
}
