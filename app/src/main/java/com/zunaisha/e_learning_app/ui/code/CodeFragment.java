package com.zunaisha.e_learning_app.ui.code;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.zunaisha.e_learning_app.R;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CodeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CodeFragment extends Fragment implements  View.OnClickListener{

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CodeFragment() {
        // Required empty public constructor
    }
    CircleImageView image1,image2,image3,image4,image5,image6,image7,image8;
    public static CodeFragment newInstance(String param1, String param2) {
        CodeFragment fragment = new CodeFragment();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_code, container, false);
        image1 = view.findViewById(R.id.chapter1);
        image2 = view.findViewById(R.id.chapter2);
        image3 = view.findViewById(R.id.chapter3);
        image4 = view.findViewById(R.id.chapter4);
        image5 = view.findViewById(R.id.chapter5);
        image6 = view.findViewById(R.id.chapter6);
        image7 = view.findViewById(R.id.chapter7);
        image8 = view.findViewById(R.id.chapter8);
        loadImage();
        image1.setOnClickListener(this);
        image2.setOnClickListener(this);
        image3.setOnClickListener(this);
        image4.setOnClickListener(this);
        image5.setOnClickListener(this);
        image6.setOnClickListener(this);
        image7.setOnClickListener(this);
        image8.setOnClickListener(this);

        return view;
    }
    private void loadImage() {
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/e-learning-app-3a635.appspot.com/o/Graphs.jpeg?alt=media&token=b04f42cb-68a4-4dcc-bbff-25f8a167a482")
                .into(image1);
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/e-learning-app-3a635.appspot.com/o/Stack.jpeg?alt=media&token=d34b858b-f347-404b-843b-c70c8bd9f720")
                .into(image2);
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/e-learning-app-3a635.appspot.com/o/array.jpeg?alt=media&token=e7244a5b-70d9-4c6e-b7eb-1fcbcc0cb49e")
                .into(image3);
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/e-learning-app-3a635.appspot.com/o/linkedList.jpeg?alt=media&token=641ec483-59da-478c-ada7-2b81da2cf198")
                .into(image4);
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/e-learning-app-3a635.appspot.com/o/queue.jpg?alt=media&token=a10bb31c-7c8e-44e8-96e6-b9be1c17bf8f")
                .into(image5);
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/e-learning-app-3a635.appspot.com/o/searching.jpeg?alt=media&token=f3bc0612-8b4c-4e6f-b9ed-3cfb5a067d4a")
                .into(image6);
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/e-learning-app-3a635.appspot.com/o/sorting.jpeg?alt=media&token=0e46fe4a-6d43-42f7-9941-2e40f5f66fe8")
                .into(image7);
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/e-learning-app-3a635.appspot.com/o/tree.jpeg?alt=media&token=c15a5d6d-c105-4346-bbff-e60bbfc2c652")
                .into(image8);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(getContext(), CodeCategory.class);
        String codeCategory = "";

        if (view.getId() == R.id.chapter1) {
            codeCategory = "chapter1";
        } else if (view.getId() == R.id.chapter2) {
            codeCategory = "chapter2";
        } else if (view.getId() == R.id.chapter3) {
            codeCategory = "chapter3";
        } else if (view.getId() == R.id.chapter4) {
            codeCategory = "chapter4";
        } else if (view.getId() == R.id.chapter5) {
            codeCategory = "chapter5";
        } else if (view.getId() == R.id.chapter6) {
            codeCategory = "chapter6";
        } else if (view.getId() == R.id.chapter7) {
            codeCategory = "chapter7";
        } else if (view.getId() == R.id.chapter8) {
            codeCategory = "chapter8";
        }

        intent.putExtra("codeCategory", codeCategory);
        startActivity(intent);
    }
}