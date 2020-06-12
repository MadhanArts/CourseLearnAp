package com.madhanarts.courselearnapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.madhanarts.courselearnapp.adapter.CategoryAdapter;
import com.madhanarts.courselearnapp.adapter.CourseAdapter;

import java.util.Arrays;
import java.util.List;

public class CoursePage extends AppCompatActivity {

    RecyclerView courseRecyclerView;
    CourseAdapter courseAdapter;

    TextView member, rating, name, price;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_page);

        courseRecyclerView = findViewById(R.id.course_recycler);

        List<String> playList = Arrays.asList(getResources().getStringArray(R.array.course1));

        getContent(playList);

        member = findViewById(R.id.members);
        rating = findViewById(R.id.rating);
        name = findViewById(R.id.names);
        price = findViewById(R.id.price);

        member.setText("10k");
        rating.setText("4.3");
        name.setText("Java");
        price.setText("100");


    }


    private void getContent(List<String> playList)
    {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        courseRecyclerView.setLayoutManager(layoutManager);
        courseAdapter = new CourseAdapter(this, playList);
        courseRecyclerView.setAdapter(courseAdapter);
        courseAdapter.notifyDataSetChanged();

    }

}