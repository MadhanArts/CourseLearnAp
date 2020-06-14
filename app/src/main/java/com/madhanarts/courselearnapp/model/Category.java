package com.madhanarts.courselearnapp.model;

public class Category {

    public String courseName;
    public String totalCourse;

    public Category(String courseName, String totalCourse)
    {
        this.courseName = courseName;
        this.totalCourse = totalCourse;

    }

    public String getCourseName() {
        return courseName;
    }

    public String getTotalCourse() {
        return totalCourse;
    }
}
