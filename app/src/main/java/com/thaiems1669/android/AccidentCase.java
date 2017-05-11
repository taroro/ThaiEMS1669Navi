package com.thaiems1669.android;

public class AccidentCase {
    private String title;
    private String location;
    private String detail;

    public AccidentCase(String title, String location, String detail) {
        this.title = title;
        this.location = location;
        this.detail = detail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
