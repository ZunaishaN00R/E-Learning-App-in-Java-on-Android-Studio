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
            chapterImage.setImageResource(R.drawable.education);
            getSupportActionBar().setTitle("heading1");
        }
        else if (chapterName.equals("heading2")) {
            arr = chapter2;
            chapterImage.setImageResource(R.drawable.globe);
            getSupportActionBar().setTitle("heading2");
        }
        else if (chapterName.equals("heading3")) {
            arr = chapter3;
            chapterImage.setImageResource(R.drawable.laptop);
            getSupportActionBar().setTitle("heading3");
        }
        else if (chapterName.equals("heading4")) {
            arr = chapter4;
            chapterImage.setImageResource(R.drawable.library_globe);
            getSupportActionBar().setTitle("heading4");
        }
        else if (chapterName.equals("heading5")) {
            arr = chapter5;
            chapterImage.setImageResource(R.drawable.mobile);
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