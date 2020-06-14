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
                new PlayList("01", "5:30 min", "Welcome to Java Intro"),
                new PlayList("02", "3:20 min", "OOP as Java"),
                new PlayList("03", "3:20 min", "Data Types in Java"),
                new PlayList("04", "4:00 min", "Operators in Java"),
                new PlayList("05", "6:15 min", "Objects of Class")
        );
        List<PlayList> pythonPlayLists = Arrays.asList(
                new PlayList("01", "4:10 min", "Welcome to Python"),
                new PlayList("02", "5:20 min", "Interpreter as Python"),
                new PlayList("03", "3:20 min", "Data Types in Python"),
                new PlayList("04", "4:00 min", "Operators in Python"),
                new PlayList("05", "6:15 min", "Objects of Class")
        );
        List<PlayList> cppPlayLists = Arrays.asList(
                new PlayList("01", "3:40 min", "Welcome to C++"),
                new PlayList("02", "4:20 min", "OOPS as C++"),
                new PlayList("03", "3:20 min", "Data Types in C++"),
                new PlayList("04", "4:00 min", "Operators in C++"),
                new PlayList("05", "6:15 min", "Objects of Class")
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