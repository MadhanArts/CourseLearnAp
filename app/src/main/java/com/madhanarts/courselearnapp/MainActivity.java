package com.madhanarts.courselearnapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.madhanarts.courselearnapp.adapter.CategoryAdapter;
import com.madhanarts.courselearnapp.model.Category;

import java.util.ArrayList;
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

        List<String> categoryList1 = Arrays.asList(getResources().getStringArray(R.array.category1));
        List<String> categoryList2 = Arrays.asList(getResources().getStringArray(R.array.category2));

        List<Category> categoryList = new ArrayList<Category>();


        getAllCategory(categoryList1);

    }

    private void getAllCategory(List<String> categoryList) {

        RecyclerView.LayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        categoryRecyclerView.setLayoutManager(layoutManager);
        categoryAdapter = new CategoryAdapter(this, categoryList);
        categoryRecyclerView.setAdapter(categoryAdapter);
        categoryAdapter.notifyDataSetChanged();

    }

}