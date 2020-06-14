package com.madhanarts.courselearnapp.model;

public class PlayList {

    public String contentNumber;
    public String contentTime;
    public String contentTitle;

    public PlayList(String contentNumber, String contentTime, String contentTitle) {
        this.contentNumber = contentNumber;
        this.contentTime = contentTime;
        this.contentTitle = contentTitle;
    }

    public String getContentNumber() {
        return contentNumber;
    }

    public String getContentTime() {
        return contentTime;
    }

    public String getContentTitle() {
        return contentTitle;
    }
}
