package com.zunaisha.e_learning_app.ui.home;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.zunaisha.e_learning_app.R;
import com.zunaisha.e_learning_app.chaptertopics.TopicActivity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }
    CardView heading1,heading2,heading3,heading4,heading5;
    ImageView image1,image2,image3,image4,image5;

    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
//    CardView heading1,heading2,heading3,heading4,heading5;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        heading1 = view.findViewById(R.id.heading1);
        heading2 = view.findViewById(R.id.heading2);
        heading3 = view.findViewById(R.id.heading3);
        heading4 = view.findViewById(R.id.heading4);
        heading5 = view.findViewById(R.id.heading5);

        image1 = view.findViewById(R.id.image1);
        image2 = view.findViewById(R.id.image2);
        image3 = view.findViewById(R.id.image3);
        image4 = view.findViewById(R.id.image4);
        image5 = view.findViewById(R.id.image5);

        loadImage();

        heading1.setOnClickListener(this);
        heading2.setOnClickListener(this);
        heading3.setOnClickListener(this);
        heading4.setOnClickListener(this);
        heading5.setOnClickListener(this);


        return view;
    }

    private void loadImage() {
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/e-learning-app-3a635.appspot.com/o/education.png?alt=media&token=cd8c93b7-9372-4305-a778-e0dc3ceae4eb")
                .into(image1);
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/e-learning-app-3a635.appspot.com/o/globe.png?alt=media&token=8570b68d-8531-425f-89b4-a80bc52b018e")
                .into(image2);
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/e-learning-app-3a635.appspot.com/o/laptop.png?alt=media&token=c78db2fa-61c3-4f86-a40e-a951604d145f")
                .into(image3);
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/e-learning-app-3a635.appspot.com/o/library_globe.png?alt=media&token=884a8010-6d24-424e-977f-70b64bb4cb7a")
                .into(image4);
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/e-learning-app-3a635.appspot.com/o/mobile.png?alt=media&token=73fe468d-e50a-464a-8f3c-80a9041b4af8")
                .into(image5);
    }


    @Override
    public void onClick(View view) {
        Intent intent = new Intent(getContext(), TopicActivity.class);
        if (view.getId() == R.id.heading1) {
            intent.putExtra("chapterName", "heading1");
        } else if (view.getId() == R.id.heading2) {
            intent.putExtra("chapterName", "heading2");
        } else if (view.getId() == R.id.heading3) {
            intent.putExtra("chapterName", "heading3");
        } else if (view.getId() == R.id.heading4) {
            intent.putExtra("chapterName", "heading4");
        } else if (view.getId() == R.id.heading5) {
            intent.putExtra("chapterName", "heading5");
        }
        startActivity(intent);
    }

}
