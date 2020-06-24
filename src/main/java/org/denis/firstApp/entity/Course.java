package org.denis.firstApp.entity;

public class Course {
    private String name;
    private Integer mark;

    public Course() {
    }

    public Course(String name, Integer mark) {
        this.name = name;
        this.mark = mark;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

