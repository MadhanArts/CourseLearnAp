package com.madhanarts.courselearnapp.model;

import java.util.List;

public class Course {

    private String courseName;
    private String price;
    private String members;
    private String rating;
    private List<PlayList> playLists;

    public Course(String courseName, String price, String members, String rating, List<PlayList> playLists) {
        this.courseName = courseName;
        this.price = price;
        this.members = members;
        this.playLists = playLists;
        this.rating = rating;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getPrice() {
        return price;
    }

    public String getMembers() {
        return members;
    }

    public String getRating() {
        return rating;
    }

    public List<PlayList> getPlayLists() {
        return playLists;
    }

}
