package com.madhanarts.courselearnapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.madhanarts.courselearnapp.adapter.CourseAdapter;
import com.madhanarts.courselearnapp.model.Course;
import com.madhanarts.courselearnapp.model.PlayList;

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

        member = findViewById(R.id.members);
        rating = findViewById(R.id.rating);
        name = findViewById(R.id.names);
        price = findViewById(R.id.price);



        int position = getIntent().getIntExtra("pos", 0);

        List<PlayList> javaPlayLists = Arrays.asList(
                new PlayList("01", "5:30", "Welcome to Java Intro"),
                new PlayList("02", "3:20", "OOP as Java")
        );
        List<PlayList> pythonPlayLists = Arrays.asList(
                new PlayList("01", "4:10", "Welcome to Python"),
                new PlayList("02", "5:20", "Interpreter as Python")
        );
        List<PlayList> cppPlayLists = Arrays.asList(
                new PlayList("01", "3:40", "Welcome to C++"),
                new PlayList("02", "4:20", "OOPS as C++")
        );

        List<Course> courses = Arrays.asList(
                new Course("Java", "500", "24k", "4.6", javaPlayLists),
                new Course("Python", "450", "27k", "4.7", pythonPlayLists),
                new Course("C++", "370", "20k", "4.3", cppPlayLists)
        );




        member.setText(courses.get(position).getMembers());
        rating.setText(courses.get(position).getRating());
        name.setText(courses.get(position).getCourseName());
        price.setText(courses.get(position).getPrice());



        getContentPlayList(courses.get(position).getPlayLists());



    }


    private void getContentPlayList(List<PlayList> playList)
    {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        courseRecyclerView.setLayoutManager(layoutManager);
        courseAdapter = new CourseAdapter(this, playList);
        courseRecyclerView.setAdapter(courseAdapter);
        courseAdapter.notifyDataSetChanged();

    }

}