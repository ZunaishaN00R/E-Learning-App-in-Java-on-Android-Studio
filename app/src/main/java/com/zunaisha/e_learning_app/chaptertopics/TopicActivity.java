package com.zunaisha.e_learning_app.chaptertopics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.zunaisha.e_learning_app.R;
import com.zunaisha.e_learning_app.chapter.one.java;

public class TopicActivity extends AppCompatActivity {

    Toolbar toolbar;
    ExpandableHeightGridView gridView;
    TopicsAdapter adapter;
    String chapterName;
    String arr[] = null;
    ImageView chapterImage;


    String chapter1[] = {"Java", "Android", "Sub Heading 1", "Sub Heading 1",
                          "Sub Heading 1","Sub Heading 1", "Sub Heading 1", "Sub Heading 1"};
    String chapter2[] = {"PHP", "Sub Heading 2", "Sub Heading 2", "Sub Heading 2",
                        "Sub Heading 2","Sub Heading 2", "Sub Heading 2", "Sub Heading 2"};
    String chapter3[] = {"Sub Heading 3", "Sub Heading 3", "Sub Heading 3", "Sub Heading 3",
                         "Sub Heading 3","Sub Heading 3", "Sub Heading 3", "Sub Heading 3"};
    String chapter4[] = {"Sub Heading 4", "Sub Heading 4", "Sub Heading 4", "Sub Heading 4",
                        "Sub Heading 4","Sub Heading 4", "Sub Heading 4", "Sub Heading 4"};
    String chapter5[] = {"Javascript", "Sub Heading 5", "Sub Heading 5", "Sub Heading 5",
                        "Sub Heading 5","Sub Heading 5", "Sub Heading 5", "Sub Heading 5"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic);

        toolbar =findViewById(R.id.toolbar);
        gridView =findViewById(R.id.topics_name);

        setSupportActionBar(toolbar);
        if(getSupportActionBar() !=null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        chapterName = getIntent().getStringExtra("chapterName");
        chapterImage = findViewById(R.id.chapter_image);

        compareAndOpen();

    }
    private void compareAndOpen(){
        if (chapterName.equals("heading1")) {
            arr = chapter1;
//            chapterImage.setImageResource(R.drawable.education);
            Glide.with(TopicActivity.this)
                    .load("https://firebasestorage.googleapis.com/v0/b/e-learning-app-3a635.appspot.com/o/education.png?alt=media&token=cd8c93b7-9372-4305-a778-e0dc3ceae4eb")
                    .into(chapterImage);
            getSupportActionBar().setTitle("heading1");
        }
        else if (chapterName.equals("heading2")) {
            arr = chapter2;
//            chapterImage.setImageResource(R.drawable.globe);
            Glide.with(TopicActivity.this)
                    .load("https://firebasestorage.googleapis.com/v0/b/e-learning-app-3a635.appspot.com/o/globe.png?alt=media&token=8570b68d-8531-425f-89b4-a80bc52b018e")
                    .into(chapterImage);
            getSupportActionBar().setTitle("heading2");
        }
        else if (chapterName.equals("heading3")) {
            arr = chapter3;
//            chapterImage.setImageResource(R.drawable.laptop);
            Glide.with(TopicActivity.this)
                    .load("https://firebasestorage.googleapis.com/v0/b/e-learning-app-3a635.appspot.com/o/laptop.png?alt=media&token=c78db2fa-61c3-4f86-a40e-a951604d145f")
                    .into(chapterImage);
            getSupportActionBar().setTitle("heading3");
        }
        else if (chapterName.equals("heading4")) {
            arr = chapter4;
//            chapterImage.setImageResource(R.drawable.library_globe);
            Glide.with(TopicActivity.this)
                    .load("https://firebasestorage.googleapis.com/v0/b/e-learning-app-3a635.appspot.com/o/library_globe.png?alt=media&token=884a8010-6d24-424e-977f-70b64bb4cb7a")
                    .into(chapterImage);
            getSupportActionBar().setTitle("heading4");
        }
        else if (chapterName.equals("heading5")) {
            arr = chapter5;
//            chapterImage.setImageResource(R.drawable.mobile);
            Glide.with(TopicActivity.this)
                    .load("https://firebasestorage.googleapis.com/v0/b/e-learning-app-3a635.appspot.com/o/mobile.png?alt=media&token=73fe468d-e50a-464a-8f3c-80a9041b4af8")
                    .into(chapterImage);
            getSupportActionBar().setTitle("heading5");
        }
        else
            arr = null;

        adapter = new TopicsAdapter(arr,TopicActivity.this);
        gridView.setAdapter(adapter);
        gridView.setExpanded(true);


        gridView.setOnItemClickListener((adapterView, view, i, l) -> {
            openActivity(arr[i]);
        });

    }

    private void openActivity(String s) {
        switch (s) {
            case "Java":
                startActivity(new Intent(TopicActivity.this, java.class));
                break;
            case "Android":
                startActivity(new Intent(TopicActivity.this, java.class));
                break;
            case "PHP":
                startActivity(new Intent(TopicActivity.this, java.class));
                break;
            case "Javascript":
                startActivity(new Intent(TopicActivity.this, java.class));
                break;
        }
    }
}