package com.madhanarts.courselearnapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.madhanarts.courselearnapp.adapter.CategoryAdapter;
import com.madhanarts.courselearnapp.model.Category;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView categoryRecyclerView;
    CategoryAdapter categoryAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        categoryRecyclerView = findViewById(R.id.course_recycler);

        List<Category> categoryList = Arrays.asList(
                new Category("Java", "17"),
                new Category("Python", "20"),
                new Category("C++ for Beginners", "15")
                );



        getAllCategory(categoryList);

    }

    private void getAllCategory(List<Category> categoryList) {

        RecyclerView.LayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        categoryRecyclerView.setLayoutManager(layoutManager);
        categoryAdapter = new CategoryAdapter(this, categoryList);
        categoryRecyclerView.setAdapter(categoryAdapter);
        categoryAdapter.notifyDataSetChanged();

    }

}